/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
