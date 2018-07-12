package ru.lonesimba.pokemonconsole.moves;

import ru.lonesimba.pokemonconsole.Move;
import ru.lonesimba.pokemonconsole.Type;

public class Bubble extends Move {

	public Bubble() {
		setName("Bubble");
		setStats(30, 40, 0);
		setType(Type.Water);
	}

}
