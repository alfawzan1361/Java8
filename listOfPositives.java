import java.util.Arrays;

/*
 * listOfPositives
 * Abdulaziz Alfawzan
 * CSIS-4550-01
 */

public class listOfPositives {

	public static void main(String[] args) {
		int[] seq1 = { -1, 5, -2, 4, -3, 3, 2, 1 };

		seq1=Arrays.stream(seq1)
		.filter(i -> i >= 0).toArray();
		for(int i: seq1) {
			System.out.println(i);
			}
		}
	}



