import java.util.stream.IntStream;

/*
 * sumAndProduct
 * Abdulaziz Alfawzan
 * CSIS-4550-01
 */

public class sumAndProduct {

	public static void main(String[] args) {
		final int[] seq1 = { 1, 2, 3, 4 };

		int sum = IntStream.of(seq1).sum();
		System.out.println("The sum of numbers is: " + sum);
		
		int product = IntStream.of(seq1).reduce(1, (a, b) -> a * b);
		System.out.println("The sum of numbers is: " + product);
	}
}
