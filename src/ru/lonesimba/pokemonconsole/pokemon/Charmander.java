package ru.lonesimba.pokemonconsole.pokemon;

import ru.lonesimba.pokemonconsole.Move;
import ru.lonesimba.pokemonconsole.Pokemon;
import ru.lonesimba.pokemonconsole.Type;

public class Charmander extends Pokemon {
	
	public Charmander() {
		Move[] list = {Move.ember, Move.defenseCurl, Move.tackle, Move.growl};
		
		setName("Charmander");
		setBaseStats(5, 39, 52, 43);
		setType(Type.Fire);
		setMoves(list);
	}
	

}
