package temperature;

import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Give the value in Celcius:");
       Scanner sc = new Scanner(System.in);
       double celcius = sc.nextDouble();
       double fahrenheit = 9.0 / 5.0 * celcius +32.0;
       System.out.println("Fahrenheit: "+fahrenheit);
    }
    
}
    
    
       
    
    

