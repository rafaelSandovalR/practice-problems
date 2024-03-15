/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merge_intervals;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[][] intervals = {{3,4}, {8,9}, {2,10}, {12,20}, {21,24}};
        
        long startTime = System.nanoTime();
        int[][] ans = sol.merge(intervals);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        
        System.out.println("Execution time in nanoseconds: " + elapsedTime);
        
        /*
            RUNTIME & MEMORY
            3-13-24:    12843500 nanoseconds
                        8ms in leetcode         46.6 MB
        
            3-13-24:    645900 nanoseconds
                        1ms in leetcode         46.44 MB
        */
    }
}
