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
        
        List<Integer[]> list = new ArrayList<Integer[]>();
        
        for (int i = 0; i < intervals.length; i++){
            
            Integer[] range = {i,1};
            
            while (i+1 < intervals.length && intervals[i][1] >= intervals[i+1][0]){
                range[0] = ++i;
            }
            
            list.add(range);
        }
        
        int[][] ans = new int[list.size()][2];
        int i = 0;
        
        for (Integer[] range: list){
            ans[i][0] = list.get(i)[0];
            ans[i][1] = list.get(i)[1];
        }
        
        return ans;
    }
}
