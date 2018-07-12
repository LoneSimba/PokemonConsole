package ru.lonesimba.pokemonconsole.moves;

import ru.lonesimba.pokemonconsole.Move;
import ru.lonesimba.pokemonconsole.Type;

public class Thunderbolt extends Move {

	public Thunderbolt() {
		setName("Thunderbolt");
		setStats(15, 90, 0);
		setType(Type.Electric);
	}

}
