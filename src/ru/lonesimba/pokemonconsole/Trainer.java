package ru.lonesimba.pokemonconsole;

public class Trainer {
	
	private String name;
	private int id;
	private Pokemon[] pokemons = new Pokemon[4];
	
	public static Trainer[] trainers = new Trainer[8];
	
	public Trainer(String name, int id) {
		setName(name);
		setId(id);
	}
	
	public static void init() {
		trainers[0] = createPlayer();
		trainers[0].setPokemonList(Pokemon.pokemons);
		trainers[1] = new Trainer("Brock", 1);
		trainers[1].setPokemonList(Pokemon.pokemons);
	}
	
	protected void setName(String trainer_name) {
		name = trainer_name;
	}
	
	public String getName() {
		return name;
	}
	
	protected void setId(int trainer_id) {
		id = trainer_id;
	}
	
	public int getId() {
		return id;
	}
	
	protected void setPokemonList(Pokemon[][] trainer_pokemons) {
		
		for(int i = 3; i >= 0; i--) {
			pokemons[i] = trainer_pokemons[i][id];
		}
		
	}
	
	public Pokemon[] getPokemonList() {
		return pokemons;
	}
	
	public static Player createPlayer() {
		System.out.println("You're new here, right? \nWhat's your name?");
		String player_name = Core.sc.nextLine();
		return new Player(player_name, 0);
	}
	
	public static void getTrainerInfo(int id) {
		System.out.print("Trainer: ");
		System.out.println(trainers[id].getName());
		System.out.println("Has pokemon: ");
		
		Pokemon[] list = trainers[id].getPokemonList();
		
		for(int i = 0; i <= list.length-1; i++) {
			System.out.println(list[i].getName());
		}
	}

}
