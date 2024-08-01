/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insert_interval;

import java.util.ArrayList;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    public int[][] insert(int[][] intervals, int[] newInterval){
        // Extract start and end points of the new interval
        int left = newInterval[0];
        int right = newInterval[1];
        boolean placed = false;
        
        var ansList = new ArrayList<int[]>();
        
        for (int[] interval : intervals){
            
            // Case 1: Current interval is completely after newInterval
            if (interval[0] > right){
                // If newInterval hasn't been inserted yet, insert it
                if (!placed) {
                    ansList.add(new int[]{left, right});
                    placed = true;
                }
                ansList.add(interval); // Add the current interval to the result (no overlap)
            } 
            // Case 2: Current interval is completely before newInterval
            else if (interval[1] < left){
                ansList.add(interval); // Add to result (no overlap)
            } 
            // Case 3: Current interval overlaps with newInterval
            else {
                // Merge overlapping intervals by updating left and right boundaries
                left = Math.min(left, interval[0]);
                right = Math.max(right, interval[1]);
            }
        }
        
        // if newInterval wasn't inserted (it's at the end), insert it
        if (!placed){
            ansList.add(new int[]{left, right});
        }
        
        // Convert ArrayList to a 2D array for return
        return ansList.toArray(new int[ansList.size()][]);
    }
}
