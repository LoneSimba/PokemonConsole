package ru.lonesimba.pokemonconsole;

import ru.lonesimba.pokemonconsole.moves.Bubble;
import ru.lonesimba.pokemonconsole.moves.DefenseCurl;
import ru.lonesimba.pokemonconsole.moves.Ember;
import ru.lonesimba.pokemonconsole.moves.Growl;
import ru.lonesimba.pokemonconsole.moves.LeafBlade;
import ru.lonesimba.pokemonconsole.moves.Leer;
import ru.lonesimba.pokemonconsole.moves.Tackle;
import ru.lonesimba.pokemonconsole.moves.Thunderbolt;

public class Move {
	
	private String name, stat;
	private int powerpoints, power, target;
	private boolean statChanger = false;
	private Type type;
	
	public static Thunderbolt thunderbolt;
	public static Bubble bubble;
	public static LeafBlade leafBlade;
	public static Ember ember;
	public static Leer leer;
	public static DefenseCurl defenseCurl;
	public static Tackle tackle;
	public static Growl growl;
		
	public static void init() {
		thunderbolt = new Thunderbolt();
		bubble = new Bubble();
		leafBlade = new LeafBlade();
		ember = new Ember();
		leer = new Leer();
		defenseCurl = new DefenseCurl();
		tackle = new Tackle();
		growl = new Growl();
	}
	
	protected void setName(String move_name) {
		name = move_name;
	}
	
	public String getName() {
		return name;
	}
	
	protected void setStats(int move_pp, int move_power, int move_target) {
		powerpoints = move_pp;
		power = move_power;
		target = move_target;
	}
	
	public int[] getStats() {
		int[] stats = {powerpoints, power, target};
		return stats;
	}
	
	
	protected void setStats(int move_pp, int move_power, int move_target, boolean move_statChanger, String move_stat) {
		powerpoints = move_pp;
		power = move_power;
		statChanger = move_statChanger;
		target = move_target;
		stat = move_stat;
	}
	
	public boolean isStatChanger() {
		return statChanger;
	}
	
	public String getAffectedStat() {
		if(stat != null) return stat;
		else return "none";
	}
	
	protected void setType(Type move_type) {
		type = move_type;
	}
	
	public Type getType() {
		return type;
	}

}
