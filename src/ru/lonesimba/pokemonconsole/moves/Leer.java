package ru.lonesimba.pokemonconsole.moves;

import ru.lonesimba.pokemonconsole.Move;
import ru.lonesimba.pokemonconsole.Type;

public class Leer extends Move {

	public Leer() {
		setName("Leer");
		setStats(30, 1, 0, true, "defense");
		setType(Type.Normal);
	}

}
