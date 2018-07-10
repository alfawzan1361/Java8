import java.util.stream.IntStream;

/*
 * max
 * Abdulaziz Alfawzan
 * CSIS-4550-01
 */

public class max {

	public static void main(String[] args) {
		int[] seq1 = { 1, 21, 3, 4, 8, 1, 7, 20 };

		int result = IntStream.of(seq1).max().getAsInt();
		System.out.println(result);
	}
}
