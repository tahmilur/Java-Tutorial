package assignment;

/**
 * @author Tahmilur Rahman
 *
 */
public class ConvertCelsiusToFahrenheit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double inputCelsius = 43;

		double fahrenheit = ((9 * inputCelsius) / 5) + 32;

		System.out.println(String.format("%.2f", fahrenheit));
		
		fahrenheit = ((9/5)*inputCelsius) + 32;

		System.out.println(String.format("%.2f", fahrenheit));
	}
}
