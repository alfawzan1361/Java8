import java.util.*;

/*
 * duplicateSequence
 * Abdulaziz Alfawzan
 * CSIS-4550-01
 */

public class duplicateSequence {
	public static void main(String[] args) {
		int[] seq1 = { 1, 2, 3 };
		for(int i: seq1) {
		List<Integer> list = Collections.nCopies(2, i);
		System.out.println(list);
	}
}
}
