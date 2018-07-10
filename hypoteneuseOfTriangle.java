

/*
 * HypoteneuseOfTriangle
 * Abdulaziz Alfawzan
 * CSIS-4550-01
 */

 
public class hypoteneuseOfTriangle {

	public static void main(String[] args){
      double base = 2;
      double height = 3;
      double Hypoteneuse;

      
      Hypoteneuse = Math.pow(base, 2) + Math.pow(height, 2); 

      System.out.println("The Hypoteneuse is: " + Math.sqrt(Hypoteneuse));
    }
}