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
		int rating = 0;

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
			rating = sc.nextInt();

			FoodTruck truck = new FoodTruck(name, food, rating);

			wheels[c] = truck;
			c++;
		}

		for (int i = 0; i < wheels.length; i++) {
			if (wheels[i] != null) {
				System.out.println(wheels[i]);
		

			}
//			for (i = 0; i < wheels.length; i++) {
//				if (wheels[i] != null) {
//					System.out.println(wheels[i]);
					
					
//				}

		}
	}

}