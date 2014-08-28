package assignment;

/**
 * @author Tahmilur
 *
 */
public class PerfectNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int startNumber = 1;
		int endNumber = 10000;
		
		for (int i = startNumber; i <= endNumber; i++) {
			
			if (isPerfectNumber(i)) {
				System.out.println(i);
			}
		}
	}

	/**
	 * @param inputNumber
	 * @return true or false
	 */
	public static boolean isPerfectNumber(int inputNumber) {

		int number = 0;
		int maxLoop = (int) inputNumber / 2;

		for (int i = 1; i <= maxLoop; i++) {

			if (inputNumber % i == 0) {
				number += i;				
			}
		}

		return (number == inputNumber);
	}
}
