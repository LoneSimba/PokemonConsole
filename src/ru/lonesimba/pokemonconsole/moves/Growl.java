package ru.lonesimba.pokemonconsole.moves;

import ru.lonesimba.pokemonconsole.Move;
import ru.lonesimba.pokemonconsole.Type;

public class Growl extends Move {

	public Growl() {
		setName("Growl");
		setStats(40, -1, 0, true, "attack");
		setType(Type.Normal);
	}

}
