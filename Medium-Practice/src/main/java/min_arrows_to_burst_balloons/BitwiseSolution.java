/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package min_arrows_to_burst_balloons;

import java.util.Arrays;

/**
 *
 * @author Rsand
 */
public class BitwiseSolution {
    public int findMinArrowShots(int[][] points){
        final int n = points.length;
        final long[] A = new long[n]; // Array that stores combined start and end points
        
        // Combine start and end points into a single long value for each balloon
        for (int i = 0; i < n; i++){
            // Shift end point 32 bits to the left and combine with start point using bitwise OR
            A[i] = (((long)points[i][1]) << 32) | (points[i][0] & 0xFFFFFFFFL);
        }
        
        Arrays.sort(A); // Sort the combined values
        
        // Extract end point of the first balloon (stored in the higher 32 bits)
        int prev = (int)(A[0] >>> 32);
        int count = 1; // Initialize arrow count
        
        // Iterate through sorted array
        for (int i = 1; i < A.length; i++){
            // If the start point of the current balloon is greater than the previous end point
            if ((int)A[i] > prev){ // Cast truncates 32 higher bits, leaving the 'starting point' value
                count++; // Increment arrow count
                prev = (int)(A[i] >>> 32); // Update the previous end point
            }
        }
        
        return count; // Return the total arrow count
    }
}
