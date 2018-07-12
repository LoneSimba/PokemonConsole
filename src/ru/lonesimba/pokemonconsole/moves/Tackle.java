package ru.lonesimba.pokemonconsole.moves;

import ru.lonesimba.pokemonconsole.Move;
import ru.lonesimba.pokemonconsole.Type;

public class Tackle extends Move {

	public Tackle() {
		setName("Tackle");
		setStats(35, 40, 0);
		setType(Type.Normal);
	}

}
