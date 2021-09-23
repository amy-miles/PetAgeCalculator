package model;

/**
 * @author Amy Miles - almiles CIS 175 - Fall 2021 Sep 23, 2021
 * This class creates the PetAgeCalculator and calculates the age of the pet converting user input
 */
public class PetAgeCalculator {
	private int yearOne = 15;//first year is equivalent to 15 human years
	private int yearTwo = 9;//second year is equivalent to 9 human years
	private int yearMultiplier;//this is set in the child classes, represents the number of years you multiply beyond those first two years
	private int userYears; //user input years
	private int petAgeResult;//result of pet age to human age calculation
	
	/**
	 * Default no-arg constructor
	 */
	public PetAgeCalculator() {

	}
	
	/**
	 * Constructor that creates a Calculator
	 * @param years the user years 
	 */
	public PetAgeCalculator(int years) {
		this.userYears = years;
		petAgeResult = calculatePetAge(years);//calls method to set the petAgeResult
	}

	/**
	 * @return the yearOne
	 */
	public int getYearOne() {
		return yearOne;
	}

	/**
	 * @param yearOne the yearOne to set
	 */
	public void setYearOne(int yearOne) {
		this.yearOne = yearOne;
	}

	/**
	 * @return the yearTwo
	 */
	public int getYearTwo() {
		return yearTwo;
	}

	/**
	 * @param yearTwo the yearTwo to set
	 */
	public void setYearTwo(int yearTwo) {
		this.yearTwo = yearTwo;
	}

	/**
	 * @return the yearMultiplier
	 */
	public int getYearMultiplier() {
		return yearMultiplier;
	}

	/**
	 * @param yearMultiplier the yearMultiplier to set
	 */
	public void setYearMultiplier(int yearMultiplier) {
		this.yearMultiplier = yearMultiplier;
	}

	/**
	 * @return the userYears
	 */
	public int getUserYears() {
		return userYears;
	}

	/**
	 * @param userYears the userYears to set
	 */
	public void setUserYears(int userYears) {
		this.userYears = userYears;
	}

	/**
	 * @return the petAgeResult
	 */
	public int getPetAgeResult() {
		return petAgeResult;
	}

	/**
	 * @param petAgeResult the petAgeResult to set
	 */
	public void setPetAgeResult(int petAgeResult) {
		this.petAgeResult = petAgeResult;
	}

	@Override
	public String toString() {
		return "PetAgeCalculator [yearOne=" + yearOne + ", yearTwo=" + yearTwo + ", yearMultiplier=" + yearMultiplier
				+ ", userYears=" + userYears + ", petAgeResult=" + petAgeResult + "]";
	}
	
	/**
	 * this method calculates the pet's age in human years. 
	 * The first year is equal to 15 years, the second to 9 years, and beyond, at a rate set 
	 * by the child classes. 
	 * @param years the user input years
	 * @return total the result of the calculation
	 */
	public int calculatePetAge(int years) {
		int total = 0;
		if (userYears == 1) {
			total = getYearOne();
		}
		if (userYears == 2) {
			total = getYearOne() + getYearTwo();
		}
		if (userYears > 2) {
			total = getYearOne() + getYearTwo() + ((userYears - 2) * yearMultiplier);
		}
		return total;
	}
	

}
