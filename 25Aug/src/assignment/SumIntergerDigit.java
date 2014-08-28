package assignment;

/**
 * @author Tahmilur
 *
 */
public class SumIntergerDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int inputNumber = 932;
		int sumNumber = 0, extractNumber;

		do {
			extractNumber = inputNumber % 10;
			inputNumber = inputNumber / 10;

			sumNumber += extractNumber;

		} while (inputNumber > 0);

		System.out.println(sumNumber);
	}
}
