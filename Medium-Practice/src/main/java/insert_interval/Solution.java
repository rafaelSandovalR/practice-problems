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
        int start = -2, end = -1, insert = -1;
        
        for (int i = 0; i < n; i++){
            
            if (intervals[i][0] < newInterval[0]) insert = i + 1;
                
            if (overlap(intervals[i], newInterval)){
                if (start < 0) start = i;
                end = i;
            }
        }
        
        int newIntervalQty = start < 0 ? n + 1 : n - end + start;
        insert = insert < 0 ? 0 : insert;
        int[][] result = new int[newIntervalQty][2];
        
        for (int i = 0, j = 0; i < newIntervalQty; i++, j++){
            
            if (start < 0 && i == insert){
                result[i] = newInterval;
                j--;
            } else if (i == start){
                result[i][0] = Math.min(intervals[start][0], newInterval[0]);
                result[i][1] = Math.max(intervals[end][1], newInterval[1]);
            } else if (i == start + 1){
                j = end + 1;
                result[i] = intervals[j];
            } else {
                result[i] = intervals[j];
            }

        }
        return result;
    }

    private boolean overlap(int[] interval, int[] newInterval) {
        
        int min1 = interval[0],  min2 = newInterval[0];
        int max1 = interval[1],  max2 = newInterval[1];
        
        if (min2 >= min1 && min2 <= max1) return true;
        if (min1 >= min2 && min1 <= max2) return true;
        
        return false;
    }

}
