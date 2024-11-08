/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package min_arrows_to_burst_balloons;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int findMinArrowShots(int[][] points){
        int res = 0;
        
        // Find Min and Max out of all intervals
        
        // Build array of size Max - Min + 1
        //      - array indices represent start of intervals
        //      - array values represent end of intervals


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] range = new int[max - min + 1];
        
        for (int i = 0; i < points.length; i++){
            int intrvlStart = points[i][0];
            int intrvlEnd = points[i][1];
            
            min = Math.min(min, intrvlStart);
            max = Math.max(max, intrvlEnd);
            
            range[intrvlStart - min] = intrvlEnd - min;
        } 
        
        

        
        
        
        // Using first interval, skip to array[value]
        //      - update count
        // Loop through entire array
        for (int i = 0; i < range.length; i++){
            
        }
    }
}
