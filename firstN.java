import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * VolumeOfSphare
 * Abdulaziz Alfawzan
 * CSIS-4550-01
 */

public class firstN {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n;

		System.out.print("Enter a value of n: ");
		n = input.nextInt();

		IntStream.range(1, n+1).forEach(i -> System.out.println(i*i));

	}
}
