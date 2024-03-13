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
        
        int[][] intervals = {{2,3}, {4,5}, {6,7}, {8,9}, {1,10}};
        
        long startTime = System.nanoTime();
        int[][] ans = sol.merge(intervals);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        
        System.out.println("Execution time in nanoseconds: " + elapsedTime);
        
        /*
            RUNTIME & MEMORY
            3-13-24:    12843500 nanoseconds    Total Time: 0.690 s
                        8ms in leetcode         46.6 MB
        */
    }
}
