/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangle;

import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle){
        
        int size = 0;
        for (List list : triangle){
            size += list.size();
        }
        int[] dp = new int[size];
        
        
        
    }
}
