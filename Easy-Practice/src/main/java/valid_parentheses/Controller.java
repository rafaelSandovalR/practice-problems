/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valid_parentheses;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String input = "([}}])";
        
        long startTime = System.nanoTime();
        boolean ans = sol.isValid(input);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        
        System.out.println("Execution time in nanoseconds: " + elapsedTime);
        
        /*
        RUNTIME + MEMORY:
            3-15-24 :   93100 nanoseconds   0.550 s
                        1 ms in Leetcode    41.6 MB
                        - Deque & Switch
                        
            3-15-24 :   4100 nanoseconds    0.494 s
                        0 ms in LeetCode    41.20 MB
                        - Char Array Stack & Switch
        
         */
    }
}
