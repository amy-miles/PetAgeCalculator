package model;

/**
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Sep 23, 2021
 */
public class CatAgeCalculator extends PetAgeCalculator{
	
	private int catMultiplier = 4;

	public CatAgeCalculator(int years) {
		this.setUserYears(years);
		this.setYearMultiplier(catMultiplier);
		this.setPetAgeResult(calculatePetAge(years));
	}

}
