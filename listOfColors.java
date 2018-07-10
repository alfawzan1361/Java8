
import java.util.Scanner;

/*
 * listOfColors
 * Abdulaziz Alfawzan
 * CSIS-4550-01
 */

public class listOfColors {
	private static Scanner input;

	public static void main(String[] args){
		input = new Scanner( System.in );
		System.out.print("Write a sentence: ");
		String line = input.nextLine();
		String[] pattern = line.split("(black)|(brown)|(blue)|(red)|(yellow)|(orange)|(purple)|(green)|(gray)|(pink)");

		for (String i : pattern) {
			System.out.println(i);
		}
	}
}

