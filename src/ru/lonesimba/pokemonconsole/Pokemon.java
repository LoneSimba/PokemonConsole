package ru.lonesimba.pokemonconsole;

import ru.lonesimba.pokemonconsole.pokemon.Bulbasaur;
import ru.lonesimba.pokemonconsole.pokemon.Charmander;
import ru.lonesimba.pokemonconsole.pokemon.Pikachu;
import ru.lonesimba.pokemonconsole.pokemon.Squirtle;

public class Pokemon {

	private String name;
	private int level, healthPointsBase, attackBase, defenseBase, healthPointsChange, attackChange, defenseChange;
	private Type type;
	private Move[] moves = new Move[4];

	//public static enum Type { Electric, Water, Fire, Grass; }
	//public static enum Move { Bubble, Thuderbolt, Ember, LeafBlade, Leer, Tackle, DefenseCurl, Growl; }
	
	public static Pokemon[][] pokemons = new Pokemon[8][8];
	 
	public static void init() {
		 pokemons[0][0] = new Bulbasaur();
		 pokemons[1][1] = new Bulbasaur(); 
		 pokemons[1][0] = new Pikachu();
		 pokemons[0][1] = new Pikachu();
		 pokemons[2][0] = new Charmander();
		 pokemons[3][1] = new Charmander();
		 pokemons[3][0] = new Squirtle();
		 pokemons[2][1] = new Squirtle();
	}
	
	protected void setName(String poke_name) {
		name = poke_name;
	}
	
	public String getName() {
		return name;
	}
	
	protected void setBaseStats(int poke_level, int poke_hp, int poke_attack, int poke_defense) {
		level = poke_level;
		healthPointsBase = poke_hp;
		attackBase = poke_attack;
		defenseBase = poke_defense;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int[] getBaseStats() {
		int[] stats = {healthPointsBase, attackBase, defenseBase};
		return stats;
	}
	
	protected void setChangedStats() {
		healthPointsChange = healthPointsBase;
		attackChange = attackBase;
		defenseChange = defenseBase;
	}
	
	public int[] getChangedStats() {
		int[] stats = {healthPointsChange, attackChange, defenseChange};
		return stats;
	}
	
	protected void setType(Type poke_type) {
		type = poke_type;
	}
	
	public Type getType() {
		return type;
	}
	
	protected void setMoves(Move[] poke_moves) {
		
		for(int i = 3; i >= 0; i--) {
			moves[i] = poke_moves[i];
		}
	}
	
	public void changeStat(String stat, int poke_statChange) {
		switch(stat) {
			case "attack":
				changeAttack(poke_statChange);
				break;
			case "defense":
				changeDefense(poke_statChange);
				break;
			case "health":
				changeHealth(poke_statChange);
				break;
			default:
				break;
		}
		
	}
	
	private void changeAttack(int poke_attackChange) {
		attackChange = poke_attackChange;
	}
	
	private void changeDefense(int poke_defenseChange) {
		defenseChange = poke_defenseChange;
	}
	
	private void changeHealth(int poke_healthChange) {
		healthPointsChange = poke_healthChange;
	}
}
