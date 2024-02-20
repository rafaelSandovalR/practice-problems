/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isomorphic_strings;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        
        Solution sol = new Solution();
        
        String s = "paper";
        String t = "title";
        
        long startTime = System.nanoTime();
        
        boolean ans = sol.isIsomorphic(s, t);
        
        long endTime = System.nanoTime();        
        long elapsedTimeInMillis = endTime - startTime;

        System.out.println("Runtime: " + elapsedTimeInMillis + " milliseconds");
    }
}
