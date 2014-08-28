package assignment;

/**
 * @author Tahmilur
 *
 */
public class FindLeapYears {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int startYear = 2001;
		int endYear = 2100;
		int counter = 0;

		for (int i = startYear; i <= endYear; i++) {
			
			if (isLeapYear(i)) {
				
				counter++;
				
				if (counter % 10 == 0) {
					System.out.println(String.format("%d ", i));
				} else {
					System.out.print(String.format("%d ", i));
				}
			}
		}
	}

	/**
	 * @param year
	 * @return
	 */
	public static boolean isLeapYear(int year) {

		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			return true;
		} else {
			return false;
		}
	}
}
