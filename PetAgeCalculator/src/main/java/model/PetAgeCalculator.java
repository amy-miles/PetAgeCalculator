package model;

/**
 * @author Amy Miles - almiles CIS 175 - Fall 2021 Sep 23, 2021
 */
public class PetAgeCalculator {
	private int yearOne = 15;
	private int yearTwo = 9;
	private int yearMultiplier;
	private int userYears;
	private int petAgeResult;

	public PetAgeCalculator() {

	}

	public PetAgeCalculator(int years) {
		this.userYears = years;
		petAgeResult = calculatePetAge(years);
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
