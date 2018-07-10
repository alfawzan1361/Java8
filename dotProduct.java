import java.util.stream.IntStream;

/*
 * DotProduct
 * Abdulaziz Alfawzan
 * CSIS-4550-01
 */


public class dotProduct {

	public static void main(String[] args) {
		final int[] seq1 = {1, 2, 3};
		final int[] seq2 = {4, -5, 6};
		
		int sum = IntStream.range(0, seq1.length)
				// 1(4) + 2(-5) + 3(6) = 12.
                .map( i -> seq1[i] * seq2[i])
                .reduce(0, Integer::sum);
		
				System.out.println(sum);
	}
}
		
