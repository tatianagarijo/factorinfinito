package net.severo.entdes;
/**
 * 
 * @author Profesor
 *
 */
public class Factorial {

	public static void main(String[] args) {

		int n = (int) (Math.random() * 10);
		int result = 1;
		System.out.println("Value of n: " + n);
		while (n > 1) {
			result = result * (n - 1);
			n--;
		}
		System.out.println("Value of n!: " + result);

	}

}
