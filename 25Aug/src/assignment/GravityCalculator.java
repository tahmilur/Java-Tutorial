package assignment;

/// 6.092: Assignment 1
/**
 * @author Tahmilur
 *
 */
public class GravityCalculator {

	public static void main(String[] args) {
		double gravity = -9.81; // Earth's gravity in m/s^2
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;

		System.out.println("The object's position after " + fallingTime
				+ " seconds is " + finalPosition + " m.");
		
		// Calculate position after given  fallingTime 
		// x(t) = 0.5 � at2 + vit + xi	
		finalPosition = 0.5 * gravity * Math.pow(fallingTime,2) + initialVelocity * fallingTime
				+ initialPosition * fallingTime;
		
		System.out.println("The object's position after " + fallingTime
				+ " seconds is " + finalPosition + " m.");
	}
}

// The output of this program is is given below
// The object's position after 10.0 seconds is 0.0 m.