/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package min_arrows_to_burst_balloons;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int findMinArrowShots(int[][] points){
        if (points.length == 1) return 1;
        int res = 0;
        
        // Sort 2D array by its second value (end points of balloons)
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        
        for (int i = 0; i < points.length; i++){

            res++; // Increment arrow count
            
            int arrow = points[i][1]; // Position arrow at righ boundary of balloon
            
            // Loop while next balloon will be popped by arrow
            while (i+1 < points.length && points[i+1][0] <= arrow){
                i++; // Move to next balloon
            }
        }

        return res;
    }
    
    
    public int findMinArrowShots(int[][] points){
        
    }
}
