package com.skilldistillery.foodtrucks;

public class FoodTruck {
	private int numericId;
	private String name;
	private String foodType;
	private int rating;
	private static int nextId = 1;


	public FoodTruck() {
		this.numericId = nextId;
		nextId++;
		
		
	}

	public FoodTruck(String name, String foodType, int rating) {
		super();
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.numericId = nextId;
		nextId++;
	}
	public FoodTruck(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Food truck id #: " + numericId + ", Name: " + name + ", Food type: " + foodType + ", Rating: " + rating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	
}