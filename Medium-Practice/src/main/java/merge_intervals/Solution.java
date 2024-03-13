/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int[][] merge(int[][] intervals){
        
        if (intervals.length <= 1){
            return intervals;
        }
        
        // Sort by ascending start point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> result = new ArrayList<>();
        // Add first interval to result list
        int[] newInterval = intervals[0];
        result.add(newInterval);
        
        for (int[] interval : intervals){
            if (interval[0] <= newInterval[1]){
                // Overlapping intervals, move the end if needed
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
        
    }
    
}
