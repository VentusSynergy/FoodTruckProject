package com.skilldistillery.foodtrucks;

public class FoodTruck {
	private int numericId;
	private String name;
	private String foodType;
	private String rating;
	private int nextId = 1;


	public FoodTruck() {
		this.numericId = nextId;
		nextId++;
		
		
	}

	public FoodTruck(String name, String foodType, String rating) {
		super();
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.numericId = nextId;
		nextId++;
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
		return "FoodTruck [numericId=" + numericId + ", name=" + name + ", foodType=" + foodType + ", rating=" + rating
				+ "]";
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

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	
}