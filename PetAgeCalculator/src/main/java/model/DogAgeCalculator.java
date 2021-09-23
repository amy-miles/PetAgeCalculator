package model;

/**
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Sep 22, 2021
 */
public class DogAgeCalculator extends PetAgeCalculator{
	
	private int dogMultiplier = 5;	

	
	public DogAgeCalculator(int years) {
		this.setUserYears(years);
		this.setYearMultiplier(dogMultiplier);
		this.setPetAgeResult(calculatePetAge(years));
	}



}
