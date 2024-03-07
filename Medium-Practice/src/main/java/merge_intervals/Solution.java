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
        int column = 0;
        
        for (int i = 0; i < intervals.length; i++){
            
            int[] range = new int[2];
            
            if (intervals[i][1] >= intervals[i+1][0]){
                
            }
        }
        
        return null;
    }
}
