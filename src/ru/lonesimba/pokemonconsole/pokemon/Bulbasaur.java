package ru.lonesimba.pokemonconsole.pokemon;

import ru.lonesimba.pokemonconsole.Move;
import ru.lonesimba.pokemonconsole.Pokemon;
import ru.lonesimba.pokemonconsole.Type;

public class Bulbasaur extends Pokemon {

	public Bulbasaur() {
		Move[] list = {Move.leafBlade, Move.growl, Move.tackle, Move.leer};
		
		setName("Bulbasaur");
		setBaseStats(5, 45, 49, 49);
		setType(Type.Grass);
		setMoves(list);
	}
	
}
