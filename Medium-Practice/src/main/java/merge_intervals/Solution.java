/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int[][] merge(int[][] intervals){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;    
        
        // Determine the min and max of the first elements in each interval
        for (int i = 0; i < intervals.length; i++){
            min = Math.min(min, intervals[i][0]);
            max = Math.max(max, intervals[i][0]);
        }
        
        // Array to track the max ending pointed enountered for each starting point
        // Indices represents starting points of each interval, adjusted so that index 0 is the smallest starting point
        // range[i] represents ending points of each interval; If zero, then no range starts at that point
        /*
            Intervals = {{3,4}, {8,9}, {2,10}, {12,20}, {21,24}};
            Index   Value
            0       8       ->  {2,10} since smallest value is 2, all representations are their actual value - 2
            1       2       ->  {3,4}
            2       0       
            3       0
            4       0       -> Any with zero means there is no interval with that starting point (No interval starts with 4+2=6)
            5       0
            6       7       ->  {8,9}
            7       0
            8       0
            9       0       
            10      18      ->  {12,22} Since ending point is 18 which is > the greatest ending value before it, then this is the
            ...                         start of a new range. Save previous range: {Index 0 + Min 2, Value 8 + Min 2} -> {2,10}
            ...                         
            ...                         New range starting point is 10
        */
        int[] range = new int[max - min + 1];
        for (int i = 0; i < intervals.length; i++){
            // Records the furthest ending point encountered so far
            range[intervals[i][0] - min] = Math.max(intervals[i][1] - min, range[intervals[i][0] - min]);
        }
        
        // Keeps track of current merged interval
        int start = 0, end = 0;
        LinkedList<int[]> result = new LinkedList<>();       
        for (int i = 0; i < range.length; i++){
            // Indicates that no interval starting at this point
            if (range[i] == 0) continue;
            
            // If true, indicates that there is an overlap
            if (i <= end){
                end = Math.max(range[i], end);
            } else{
                // Indicates end of previous merged interval
                result.add(new int[] {start + min, end + min});
                // Marks the beginning of a new merged interval
                start = i;
                end = range[i];
            }
        }
        // Adds the final merged interval
        result.add(new int[]{start + min, end + min});
        return result.toArray(new int[result.size()][]);

        /*  FIRST SOLUTION
        
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
        */
    }
    
}
