package model;

/**
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Sep 22, 2021
 */
public class DogAgeCalculator extends PetAgeCalculator{
	
	private int dogMultiplier = 5;//the rate at which a dog ages after the first two years	

	/**
	 * Thsi constructor is used to set the multiplier in the super class
	 * @param years user input years
	 */
	public DogAgeCalculator(int years) {
		this.setUserYears(years);
		this.setYearMultiplier(dogMultiplier);
		this.setPetAgeResult(calculatePetAge(years));
	}



}
