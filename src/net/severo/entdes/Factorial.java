package net.severo.entdes;
/**
 * 
 * @author Tatiana_Garijo
 *
 */
public class Factorial {

	public static void main(String[] args) {

		int n = (int) (Math.random() * 10);
		int result = 1;
		String value="Wert von n: ";
		System.out.println(value + n);
		while (n > 1) {
			result = result * (n - 1);
		}
		System.out.println(value + result);

	}

}
