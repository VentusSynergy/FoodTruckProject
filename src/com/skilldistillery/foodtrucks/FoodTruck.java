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
	public int getNumericId() {
		return numericId;
	}

	public void setNumericId(int numericId) {
		this.numericId = numericId;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Food truck id #: " + numericId + ", Name: " + name + ", Food type: " + foodType + ", Rating: " + rating;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	
}