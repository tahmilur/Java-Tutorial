package assignment;

/// 6.092: Assignment 2
public class FooCorporation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		calculateWage("Employee 1", 7.5, 35);
		calculateWage("Employee 2", 8.20, 47);
		calculateWage("Employee 3", 10, 73);
		
		calculateWage("Employee 4", 6, 100);
	}

	/**
	 * @param employeeName
	 * @param basePay
	 * @param workHours
	 */
	static void calculateWage(String employeeName, double basePay,
			double workHours) {

		double minimumBasePay = 8.00;
		double maxWorkHours = 60;
		double overTimeHours = 40;
		double overTimeRate = 1.5;
		double overtime = 0;

		double paidAmount = 0;

		if (basePay < minimumBasePay) {
			System.out
					.println(employeeName
							+ "\tError: Basic pay must not less than "
							+ minimumBasePay);
		}

		if (workHours > maxWorkHours) {
			System.out.println(employeeName
					+ "\tError: working hours must not greater than "
					+ maxWorkHours + " hours");
		}

		// calculate wage
		if (basePay >= minimumBasePay && workHours <= maxWorkHours) {
			overtime = workHours > overTimeHours ? (workHours - overTimeHours)
					: 0;

			paidAmount = ((workHours - overtime) * basePay)
					+ (overtime * basePay * overTimeRate);

			System.out.println(employeeName + "\tPaid amount: " + paidAmount);
		}
	}
}
