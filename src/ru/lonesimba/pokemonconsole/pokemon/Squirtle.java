package ru.lonesimba.pokemonconsole.pokemon;

import ru.lonesimba.pokemonconsole.Move;
import ru.lonesimba.pokemonconsole.Pokemon;
import ru.lonesimba.pokemonconsole.Type;

public class Squirtle extends Pokemon {

	public Squirtle() {
		Move[] list = {Move.bubble, Move.growl, Move.leer, Move.tackle};
		
		setName("Squirtle");
		setBaseStats(5, 44, 48, 65);
		setType(Type.Water);
		setMoves(list);
	}

}
