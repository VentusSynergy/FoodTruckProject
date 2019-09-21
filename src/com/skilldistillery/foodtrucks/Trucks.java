package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class Trucks {
	static FoodTruck food = new FoodTruck();
	static FoodTruck rating = new FoodTruck();
	static FoodTruck name = new FoodTruck();
	static FoodTruck[] fTruck;
	private int numOfTruck = 0;
	
	private final static int MAX_NUM = 5;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter truck name: ");
		String name1 = sc.next();
		name.setName(name1);
		
		System.out.println("Enter food type");
		String food1 = sc.next();
		food.setFoodType(food1);
		
		System.out.println("Set rating: ");
		int rating = sc.nextInt();
		rating.set
		
		

	}
	public Trucks() {
		fTruck = new FoodTruck[MAX_NUM];
	}
	public void addTruck(FoodTruck f) {
		fTruck[numOfTruck] = f;
		numOfTruck++;
		
	}

}
