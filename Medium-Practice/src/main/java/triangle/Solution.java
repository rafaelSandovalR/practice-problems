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
        
        for (int row = triangle.size() - 1; row > 0; row--){
            
            for (int left = 0, right = 1; right < triangle.get(row).size(); left++, right++){
                int leftCell = triangle.get(row).get(left);
                int rightCell = triangle.get(row).get(right);
                int minSum = triangle.get(row - 1).get(left) + Math.min(leftCell, rightCell);
                
                triangle.get(row - 1).set(left, minSum);
            }
        }
        return triangle.get(0).get(0);
    }
}
