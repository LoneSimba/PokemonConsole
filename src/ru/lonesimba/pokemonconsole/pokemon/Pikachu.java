package ru.lonesimba.pokemonconsole.pokemon;

import ru.lonesimba.pokemonconsole.Move;
import ru.lonesimba.pokemonconsole.Pokemon;
import ru.lonesimba.pokemonconsole.Type;

public class Pikachu extends Pokemon {
	
	public Pikachu() {
		Move[] list = {Move.thunderbolt, Move.defenseCurl, Move.tackle, Move.leer};
		
		setName("Pikachu");
		setBaseStats(5, 35, 55, 30);
		setType(Type.Electric);
		setMoves(list);
	}

}
