package valuereplaceex;

/**
 *
 * @author Jordan
 */
public class ValueReplaceEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int first = 7;
         int second = 19;
         int third;
         third = second;
         second = first;
         first = third;
         
 /* "glass" exercise.Creating a third variable to solve a problem. */
         System.out.println("first=" + first + " second=" + second);
         
    }
    
}
