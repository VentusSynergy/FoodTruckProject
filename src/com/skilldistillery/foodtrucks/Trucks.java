package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class Trucks {
	private final static int MAX_NUM = 5;
	private static FoodTruck[] wheels = new FoodTruck[MAX_NUM];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 0;
		String name = "";
		String food = "";
		String rating = "";

		while (c < 5) {
			c++;

			System.out.println("Enter truck name: ");
			name = sc.next();
			if (name.equalsIgnoreCase("off"))
				break;

			System.out.println("Enter food type: ");
			food = sc.next();
			if (food.equalsIgnoreCase("off"))
				break;

			System.out.println("Set rating: ");
			rating = sc.next();
			if (rating.equalsIgnoreCase("off"))
				break;

			FoodTruck truck = new FoodTruck(name, food, rating);

			for (int i = 0; i < wheels.length; i++) {
				wheels[i] = truck;
			}
			System.out.println(wheels[0]);
			System.out.println(wheels[1]);
			System.out.println(wheels[2]);
			System.out.println(wheels[3]);
			System.out.println(wheels[4]);

		}

	}

}