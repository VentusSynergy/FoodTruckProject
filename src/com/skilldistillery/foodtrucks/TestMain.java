package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class TestMain {
	private final static int MAX_NUM = 5;
	private static FoodTruck[] wheels = new FoodTruck[MAX_NUM];
	private static FoodTruck[] ratingCount = new FoodTruck[MAX_NUM];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 0;
		String name = "";
		String food = "";
		int rating = 0;
		int ave = 0;

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
			FoodTruck rate = new FoodTruck(rating);

			wheels[c] = truck;
			ratingCount[c] = rate;
			
			int tar = rating;
			int next = ave + tar;
			tar = ave;
			ave = next;
			
			
			
			
			c++;
		}

		for (int i = 0; i < wheels.length; i++) {
			if (wheels[i] != null) {
				System.out.println(wheels[i]);

			}
		}
		//could make shorter
		double average = (((double) ave) / c) + 0.005;
		average = average * 100;
		average = (int) average;
		average = (double) average;
		average = average / 100;
		System.out.println("Average rating: " + average);

		for (int i = 0; i < ratingCount.length; i++) {
			if (ratingCount[i] != null) {

			}
		}
	}
}
