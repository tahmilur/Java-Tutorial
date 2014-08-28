package assignment;

/**
 * @author Tahmilur
 *
 */
public class PopulationProjection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int noOfYear = 5;
		int currentPopulation = 312032486;
		int birth = 7;
		int death = 13;
		int immigrant = 45;

		int secondsInYear = 365 * 24 * 60 * 60;

		int birthPerYear = (int) secondsInYear / birth;
		int deathPerYear = (int) secondsInYear / death;
		int immigrantPerYear = (int) secondsInYear / immigrant;
		int populationIncreasePerYear = birthPerYear + immigrantPerYear - deathPerYear;

		for (int i = 1; i <= noOfYear; i++) {
			currentPopulation += populationIncreasePerYear;
			System.out.println(i + " year(s) population are "
					+ currentPopulation);
		}
	}
}