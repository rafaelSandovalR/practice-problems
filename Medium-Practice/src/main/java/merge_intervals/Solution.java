/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merge_intervals;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int[][] merge(int[][] intervals){
        
        List<int[]> list = new ArrayList<int[]>();
        
        for (int i = 0; i < intervals.length; i++){
            
            int leftBound = intervals[i][0];
            int rightBound = intervals[i][1];
            int[] range = {leftBound, rightBound};
            
            
            while (i+1 < intervals.length && intervals[i][1] >= intervals[i+1][0]){
                i++;
                range[1] = intervals[i][1];
            }
            
            list.add(range);
        } 
        
        return null;
    }
}
