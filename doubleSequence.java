import java.util.Arrays;

/*
 * DotProduct
 * Abdulaziz Alfawzan
 * CSIS-4550-01
 */

public class doubleSequence {

	public static void main(String[] args) {
		int[] seq1 = {1, 2, 3};

		seq1=Arrays.stream(seq1)
		.map(i -> i* 2).toArray();
		for(int i: seq1) {
			System.out.println(i);
		}
	}
}
