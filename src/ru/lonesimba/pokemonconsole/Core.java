package ru.lonesimba.pokemonconsole;

import java.lang.System;
import java.util.Scanner;

public class Core {
	
	//It's in git now!
	
	public static Scanner sc = new Scanner(System.in);
	private static int turnCounter = 0;
	private static Battle battle;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Pokemon Console Battle system! \nLet me set something up before we get started!");
		Move.init();
		Pokemon.init();
		Trainer.init();
		System.out.println("There's your Trainer ID:");
		Trainer.getTrainerInfo(0);
		System.out.println("There's info about the second trainer.");
		Trainer.getTrainerInfo(1);
		startBattle();
		
		sc.close();
	}
	
	private static void startBattle() {
		System.out.println("Would you like to battle? Y or anykey");
		String answer = sc.nextLine().toUpperCase();
		battle = new Battle();
		if(answer.equals("Y")) battle.init(Trainer.trainers);
		else System.out.println("Oh, well, bye, then... \nNo data saved!");
	}

}
