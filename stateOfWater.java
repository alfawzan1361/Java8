import java.util.Scanner;

/*
 * StateOfWater
 * Abdulaziz Alfawzan
 * CSIS-4550-01
 */


public class stateOfWater {
	private static Scanner input;

	public static void main(String[] args){
      input = new Scanner( System.in );
      final double temperature;

      System.out.print("Enter a temperature in Fahrenheit : ");
      temperature = input.nextDouble();
      
      if (temperature <= 32){
    	  System.out.println("The state of water is solid. ");
      }else{
    	  if (temperature >= 33 && temperature <= 211){
    		  System.out.println("The state of water is liquid. ");
    	  }else{
    		  System.out.println("The state of water is gas. ");
    	  }
      }
	}
}
