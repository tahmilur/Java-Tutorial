package assignment;

/// 6.092: Assignment 3
/**
 * @author Tahmilur Rahman
 *
 */
public class Marathon {

	public static void main(String[] arguments) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
				"Matt", "Alex", "Emma", "John", "James", "Jane", "Emily",
				"Daniel", "Neda", "Aaron", "Kate" };
		int[] times = {   265, 341, 273, 278, 329, 445, 402, 388, 275, 334, 412,
				393, 299, 243, 343, 317 };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ": " + times[i]);
		}

		// Find fastest runner
		System.out.println("");

		int fastestIndex = findFastestRunner(times);
		System.out.println("Fastest runner: " + names[fastestIndex] + ": "
				+ times[fastestIndex]);

		// Find second fastest runner
		int secondFastestIndex = findSecondFastestRunner(times);
		System.out.println("Second Fastest runner: "
				+ names[secondFastestIndex] + ": " + times[secondFastestIndex]);
	}

	/**
	 * @param times
	 * @return
	 */
	public static int findFastestRunner(int[] times) {
		int index = 0;
		int fastestTime = times[0];
		for (int i = 1; i < times.length; i++) {
			if (times[i] < fastestTime) {
				fastestTime = times[i];
				index = i;
			}
		}
		return index;
	}

	/**
	 * @param names
	 * @param times
	 * @return
	 */
	public static int findSecondFastestRunner(int[] times) {
		int index = 0;
		int fastestIndex = findFastestRunner(times);

		int fastestTime = fastestIndex == 0 ? times[1] : times[0];

		for (int i = 1; i < times.length; i++) {
			if (times[i] < fastestTime && times[fastestIndex] != times[i]) {
				fastestTime = times[i];
				index = i;
			}
		}

		return index;
	}
}
