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
        // array to flag merged ranges
        boolean[] merged = new boolean[intervals.length];

        
        for (int i = 0; i < intervals.length; i++){
            if (merged[i]){
                continue;
            }
            int[] currentRange = {intervals[i][0], intervals[i][1]};
            
            for (int j = i+1; j < intervals.length; j++){

                int[] rangesToCheck = {intervals[j][0], intervals[j][1]};
                
                if (!merged[j]){
                    if ( rangesOverlap(currentRange, rangesToCheck)){
                        
                        currentRange[0] = Math.min(currentRange[0], intervals[j][0]);
                        currentRange[1] = Math.max(currentRange[1], intervals[j][1]);
                        merged[j] = true;
                    }
                }
            }
            
            list.add(currentRange);
            merged[i] = true;
        }
        
        int[][] ans = new int[list.size()][2];
        
        for (int i = 0; i < list.size(); i++){
            ans[i][0] = list.get(i)[0];
            ans[i][1] = list.get(i)[1];
        }
        
        return ans;
    }
    
    private boolean rangesOverlap(int[] currentRange, int[] rangeToCheck){
               
        if ( (rangeToCheck[0] >= currentRange[0] && rangeToCheck[0] <= currentRange[1]) 
                || (rangeToCheck[1] >= currentRange[0] && rangeToCheck[1] <= currentRange[1])) {
            return true;
        }
        return false;
    }
}
