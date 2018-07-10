import java.util.HashSet;
import java.util.Set;

/*
 * removeDuplicates
 * Abdulaziz Alfawzan
 * CSIS-4550-01
 */


public class removeDuplicates {

	public static void main(String[] args) {
		int[] seq1 = {1, 2, 1, 3, 5, 3, 4, 2, 4, 1, 5, 2, 5, 3};
		Set<Object> notDup = new HashSet<>();
		
		for (int i : seq1) {
			notDup.add(i);
		}
        System.out.println(notDup);
	}
}
