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
        int min = triangle.get(0).get(0);
        
        if (triangle.size() == 1) return min;
        
        for (int row = 1, prevCol = 0; row < triangle.size(); row++){
            int option1 = triangle.get(row).get(prevCol);
            int option2 = triangle.get(row).get(prevCol + 1);
            
            if (option1 < option2){
                min += option1;
            } else{
                min += option2;
                prevCol++;
            }
            
        }
        
        return min;
    }
}
