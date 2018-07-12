package ru.lonesimba.pokemonconsole;

import java.util.Random;

public class Battle {
	
	private Pokemon currentPlayerPokemon, currentFoePokemon;
	private Trainer player, foe;
	
	public void init(Trainer[] battlingTrainers) {
		System.out.println("Battle begins!");
		setBattlers(battlingTrainers[0], battlingTrainers[1]);
		setStartingCurrents();
	}
	
	public void turnPlayer() {
		System.out.println("What should " + currentPlayerPokemon.getName() + " do?");
		System.out.println("Battle | Change | Run");
		String answer = Core.sc.nextLine();
		switch(answer) {
		case "Battle":
			
		}
	}
	
	public void turnFoe() {
		
	}
	
	protected void setBattlers(Trainer trainer_player, Trainer trainer_foe) {
		player = trainer_player;
		foe = trainer_foe;
	}
	
	protected void setStartingCurrents() {
		currentPlayerPokemon = player.getPokemonList()[0];
		currentFoePokemon = foe.getPokemonList()[0];
	}
	
	protected boolean changePokemon(Trainer changingTrainer) {
		Pokemon[] list = changingTrainer.getPokemonList();
		if(changingTrainer.getId() == 0) {
			System.out.println("Which pokemon do you choose?");
			
			for(int i = 0; i >= list.length-1; i++) {
				if(!(list[i].getChangedStats()[0] <= 0)) {
					System.out.println(list[i].getName());
				} else {
					list[i] = null;
				}
			}
			
			String answer = Core.sc.nextLine();
			for(int i = 0; i >= list.length-1; i++) {
				if(list[i] == null) { 
					continue; 
				} else if((answer.equals(list[i].getName()))) {
					currentPlayerPokemon = list[i];
					System.out.println("Go for it, " + list[i].getName() + "!");
					return true;
				} else {
					System.out.println("There's no such pokemon!");
					return false;
				}
			}
		} else {
			for(int i = 0; i >= list.length-1; i++) {
				if((list[i].getType() == Type.Electric && currentPlayerPokemon.getType() == Type.Water) ||
				   (list[i].getType() == Type.Water && currentPlayerPokemon.getType() == Type.Fire) ||
				   (list[i].getType() == Type.Fire && currentPlayerPokemon.getType() == Type.Grass) ||
				   (list[i].getType() == Type.Grass && currentPlayerPokemon.getType() == Type.Water)
				  ) {
					if(!(list[i].getChangedStats()[0] <= 0)) {
						currentFoePokemon = list[i];
						System.out.println("Trainer " + changingTrainer.getName() + " sent out " + list[i].getName() + "!");
						return true;
					}
				} else {
					if(!(list[i].getChangedStats()[0] <= 0)) {
						currentFoePokemon = list[i];
						System.out.println("Trainer " + changingTrainer.getName() + " sent out " + list[i].getName() + "!");
						return true;
					}
				}
			}
		}
		return false;
	}
	
	protected void dealDamage(Move move, Pokemon dealer) {
		Pokemon target;
		String resultText = "";
		String resultBonus = "";
		
		if(move.getStats()[2] == 0) {
			target = currentFoePokemon;
			resultText += "Foe's ";
		} else {
			target = currentPlayerPokemon;
			resultText += "Player's ";
		}
		
		if(move.isStatChanger()) {
			target.changeStat(move.getAffectedStat(), move.getStats()[1]);
			resultText += target.getName() + " " + move.getAffectedStat();
			if(move.getStats()[1] < 0) resultText += " fell!";
			else resultText += " rose!";
		} else {
			double random = new Random().nextDouble();
			double randomMod = 0.85d + (random * (1.0d - 0.85d));
			double modifier = 1*1*1*1*randomMod*1*1;
			int damage;
			
			
			if(move.getType() == dealer.getType()) modifier *= 1.5d;
			else modifier *= 1d;
			
			if((move.getType() == Type.Electric && target.getType() == Type.Water) ||
				(move.getType() == Type.Water && target.getType() == Type.Fire) ||
				(move.getType() == Type.Fire && target.getType() == Type.Grass) ||
				(move.getType() == Type.Grass && target.getType() == Type.Water)
			  ) {
				modifier *= 2d;
				resultBonus += "It's super effective! (2)";
			} else if((move.getType() == Type.Fire && target.getType() == Type.Water || target.getType() == Type.Fire) ||
					   (move.getType() == Type.Water && target.getType() == Type.Grass || target.getType() == Type.Water) ||
					   (move.getType() == Type.Grass && target.getType() == Type.Fire || target.getType() == Type.Grass) ||
					   (move.getType() == Type.Electric && target.getType() == Type.Grass || target.getType() == Type.Electric)
					 ) {
				modifier *= .5d;
				resultBonus += "It's not very effective...(1/2)";
			} else {
				modifier *= 1d;
				resultBonus += "It's alright. (1)";
			}
			
			damage = (int) (((((2 * dealer.getLevel()) / 5 + 2) * move.getStats()[1] * (dealer.getChangedStats()[1] / target.getChangedStats()[3]) / 5) + 2) * Math.round(modifier)); 
			target.changeStat("health", damage);			

			resultText += "used " + move.getName() + " and deals " + damage + " to target " + target.getName() + "!";			
		}
		
		System.out.println(resultText);
		if (!resultBonus.equals("")) System.out.println(resultBonus);
		
		System.out.println("Current target " + target.getName() + " stats:");
		System.out.println("Health: " + target.getChangedStats()[1] + "/" + + target.getBaseStats()[1] + " \nAttack: " + target.getChangedStats()[2] + " (" + target.getBaseStats()[2] + " base) \nDefense: " + target.getChangedStats()[3] + " (" + target.getBaseStats()[3] + " base)");
		
	}
}
