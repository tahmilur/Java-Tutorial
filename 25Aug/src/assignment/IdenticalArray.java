package assignment;

import java.util.ArrayList;

/**
 * @author Tahmilur
 *
 */
public class IdenticalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] list1 = { 5, 2, 5, 6, 6, 1 };
		int[] list2 = { 1, 6, 2, 6, 5, 5 };

		if (isEquals(list1, list2)) {
			System.out.println("They are equals.");
		} else {
			System.out.println("They are not equals.");
		}
	}

	/**
	 * @param list1
	 * @param list2
	 * @return true or false
	 */
	public static boolean isEquals(int[] list1, int[] list2) {

		ArrayList<Integer> tempArray = new ArrayList<Integer>();

		if ((list1 == null && list2 == null)) {
			
			return true;

		} else if ((list1 == null && list2 != null)
				|| (list1 != null && list2 == null)) {
			
			return false;

		} else if (list1.length != list2.length) {
			
			return false;

		} else {

			for (int i = 0; i < list1.length; i++) {

				boolean isFound = false;
				int findNumber = list1[i];

				for (int j = 0; j < list2.length; j++) {

					if (findNumber == list2[j] && !tempArray.contains(j)) {

						isFound = true;
						tempArray.add(j);

						break;
					}
				}

				if (!isFound) {
					return false;
				}
			}

			return true;
		}
	}
}
