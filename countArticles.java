import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;;
/*
 * countArticles
 * Abdulaziz Alfawzan
 * CSIS-4550-01
 */

public class countArticles {
	private static Scanner input;

	public static void main(String[] args){
		input = new Scanner( System.in );
		System.out.print("Write a sentence: ");
		String line = input.nextLine();
		
		Pattern pattern = Pattern.compile("( a )|( an )|( the )");
		Matcher m = pattern.matcher(line);
		int count = 1;
		
		while (m.find()) {
			count++;
		}
		System.out.println(count);
	}
}