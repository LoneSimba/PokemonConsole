package ru.lonesimba.pokemonconsole.moves;

import ru.lonesimba.pokemonconsole.Move;
import ru.lonesimba.pokemonconsole.Type;

public class DefenseCurl extends Move {

	public DefenseCurl() {
		setName("Defense Curl");
		setStats(40, -1, 1, true, "defense");
		setType(Type.Normal);
	}

}
