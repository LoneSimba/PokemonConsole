package ru.lonesimba.pokemonconsole.moves;

import ru.lonesimba.pokemonconsole.Move;
import ru.lonesimba.pokemonconsole.Type;

public class Ember extends Move {

	public Ember() {
		setName("Ember");
		setStats(25, 40, 0);
		setType(Type.Fire);
	}

}
