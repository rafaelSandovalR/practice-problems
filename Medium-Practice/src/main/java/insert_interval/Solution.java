/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insert_interval;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval){
        
        int n = intervals.length;
        if (n == 0) return new int[][] {{newInterval[0],newInterval[1]}};
        int start = -2, end = -1, insert = 0;
        
        // Loop to determine start and end indices to overlapping intervals
        // AND index to insert in case there is no overlap
        for (int i = 0; i < n; i++){
            
            // Case no overlap: Determine which index the new interval should be inserted into
            if (intervals[i][0] < newInterval[0]) insert = i + 1; // If no interval is less than newInterval, insert stays at 0
             
            // If current interval overlaps with new interval
            if (Math.max(intervals[i][0], newInterval[0]) <= Math.min(intervals[i][1], newInterval[1])){
                start = start < 0 ? i : start; // If start hasn't been initiated, set start
                end = i; // End will be updated until the last overlapping occurence
            }
        }
        
        // Determine how many intervals after merging/inserting
        // If no overlap: new array will be one more than old
        // Else: condense merged qty into 1 to get new qty
        int newIntervalQty = start < 0 ? n + 1 : n - end + start;
       
        
        // Create and fill new array with merged/inserted ranges
        int[][] result = new int[newIntervalQty][2];
        for (int i = 0, j = 0; i < newIntervalQty; i++, j++){ // i: index to place in result, j: index to grab from in intervals
            
            // Alternate way to write if-else block 
            result[i] = start < 0 && i == insert
                    ? newInterval // Case: No overlap, insert newInterval
                    : i == start
                            ? new int[]{Math.min(intervals[start][0], newInterval[0]), Math.max(intervals[end][1], newInterval[1])} // Case: Merge at start
                    : i == start + 1
                            ? intervals[end + 1]  // Case: Move to next after merge
                            : intervals[j];       // Case: Copy existing interval

            
//            if (start < 0 && i == insert){ // If no overlaps existed, insert new interval at 'insert' index
//                result[i] = newInterval;
//                j--; // Adjust pointer due to insertion
//            } else if (i == start){ // If overlaps exist, merge from start to end, place at start index
//                result[i][0] = Math.min(intervals[start][0], newInterval[0]);
//                result[i][1] = Math.max(intervals[end][1], newInterval[1]);
//            } else if (i == start + 1){ // Only the iteration after merging
//                j = end + 1; // Adjust pointer to be after the merged intervals
//                result[i] = intervals[j]; // Copy over interval
//            } else {
//                result[i] = intervals[j];
//            }

        }
        return result;
    }

}
