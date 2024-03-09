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
        // array to flag checked ranges
        boolean[] checked = new boolean[intervals.length];
        int start = intervals[0][0];
        int end = intervals[0][1];
        checked[0] = true;
        
        for (int i = 0; i < intervals.length; i++){
            
            for (int j = i+1; j < intervals.length; j++){
                if (intervals[j][0] <= start){
                    start = intervals[j][0];
                    end = Math.max(end, intervals[j][1]);
                }
            }
        }
        
        int[][] ans = new int[list.size()][2];
        
        for (int i = 0; i < list.size(); i++){
            ans[i][0] = list.get(i)[0];
            ans[i][1] = list.get(i)[1];
        }
        
        return ans;
    }
}
