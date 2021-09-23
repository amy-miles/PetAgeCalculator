package model;

/**
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Sep 23, 2021
 */
public class CatAgeCalculator extends PetAgeCalculator{
	
	private int catMultiplier = 4;//the rate at which a cat ages for every year beyond the first two
	
	/**
	 * This constructor sets the multiplier in the super class
	 * @param years user input years
	 */
	public CatAgeCalculator(int years) {
		this.setUserYears(years);
		this.setYearMultiplier(catMultiplier);
		this.setPetAgeResult(calculatePetAge(years));
	}

}
