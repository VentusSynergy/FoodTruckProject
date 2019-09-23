package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class TestMain {
	private final static int MAX_NUM = 5;
	private static FoodTruck[] wheels = new FoodTruck[MAX_NUM];
	private static FoodTruck[] highRate = new FoodTruck[MAX_NUM];
	private static int i;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 0;
		String name = "";
		String food = "";
		int rating = 0;
		int ave = 0;
		int hih = 0;

		while (c < 5) {

			System.out.println("Enter truck name: ");
			name = sc.next();
			if (name.equalsIgnoreCase("quit"))
				break;

			System.out.println("Enter food type: ");
			food = sc.next();
			if (food == null) {
				food = "";
			}

			System.out.println("Set rating: ");
			do {
				rating = sc.nextInt();
				if (rating > 10 || rating < 1) {
					System.out.println("Pick a rating from 1 to 10");
				}
			} while (rating > 10 || rating < 1);

			FoodTruck truck = new FoodTruck(name, food, rating);

			wheels[c] = truck;
			highRate[c] = truck;
			
			if(highRate[0].getRating() < highRate[c].getRating()) {
				highRate[0] = highRate[c];
			}
			c++;
			
			
			
			
				
			

			// average calculation start
			int tar = rating;

			int next = ave + tar;
			tar = ave;
			ave = next;

		}
		
		double average;

		// could make shorter
		average = (((double) ave) / c) + 0.005;
		average = average * 100;
		average = (int) average;
		average = (double) average;
		average = average / 100;

		menu(average, hih, wheels, sc, i);
	}

	private static void menu(double average, int hih, FoodTruck[] wheels, Scanner sc, int i) {
		System.out.println("** MENU **\n\n1. List all existing food trucks\n\n2. See the average rating of food trucks");
		System.out.println("\n3. Display the highest-rated food truck\n\n4. Quit");
		int input = sc.nextInt();

		while (input != 4) {
			switch (input) {
			case 1:
				for (i = 0; i < wheels.length; i++) {
					if (wheels[i] != null) {
						System.out.println("\n" + wheels[i] + "\n");
					}
				}
				System.out.println("\n1** MENU **\n\n1. List all existing food trucks\n\n2. See the average rating of food trucks");
				System.out.println("\n3. Display the highest-rated food truck\n\n4. Quit");
				input = sc.nextInt();
				break;
			case 2:
				System.out.println("\nAverage rating: " + average + "\n");
				System.out.println("** MENU **\n\n1. List all existing food trucks\n\n2. See the average rating of food trucks");
				System.out.println("\n3. Display the highest-rated food truck\n\n4. Quit");
				input = sc.nextInt();
				break;
			case 3:
				System.out.println("\nHighest rating: ");
				if (highRate[0] != null)
					System.out.println(highRate[0]);
				System.out.println("\n** MENU **\n\n1. List all existing food trucks\n\n2. See the average rating of food trucks");
				System.out.println("\n3. Display the highest-rated food truck\n\n4. Quit");
				input = sc.nextInt();
				break;
			case 4:
				System.out.println("Ending");
				sc.close();
			default:
				System.out.println("** MENU **\n\n1. List all existing food trucks\n\n2. See the average rating of food trucks");
				System.out.println("\n3. Display the highest-rated food truck\n\n4. Quit");
				input = sc.nextInt();
				break;

			}
		}
		

	}
}
