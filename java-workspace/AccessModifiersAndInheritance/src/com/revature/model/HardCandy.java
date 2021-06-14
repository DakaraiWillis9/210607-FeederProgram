package com.revature.model;

public class HardCandy extends Candy {

	/* TODO:
	 * Add hardycandy specific fields 
	 * 
	 * add hardcandy specific methods
	 * 
	 * Set up constructor to establish the state of the hardycandy 
	 * 
	 * Override toString
	 * 
	 */
	String shape = "square";
	
	public HardCandy() {
		this.name = "some kind of hard candy";
		this.numberOfCalories = 50.0;
		this.setMySecretCandyNumber(3);
	}
	
	
	public String eatHardCandy() {
		return "Yum this hard candy is delicioso.";
	}
	
	
	public void printHardCandy() {
		
		System.out.println(this.getName());
		System.out.println(this.getNumberOfCalories());
		System.out.println(this.getMySecretCandyNumber());
		System.out.println(shape);
	}
	
	
	
	public String toString() {
		return "Name: "+this.getName()+
				" Calories: "+this.getNumberOfCalories()+
				" SecretNumber "+this.getMySecretCandyNumber();
	}
}
