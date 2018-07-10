import java.util.Scanner;

/*
 * VolumeOfSphare
 * Abdulaziz Alfawzan
 * CSIS-4550-01
 */


public class volumeOfSphare {

	public static void main(String[] args){
     double radius = 3;
     double sphare;

      
	  sphare = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

      System.out.println("The volume of a sphare is: " + sphare);
    }
}
