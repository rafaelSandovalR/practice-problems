/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spiral_matrix;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix){
        
        List<Integer> spiral = new ArrayList<>();
        int rowMin = 0, rowMax = matrix.length;
        int colMin = 0, colMax = matrix[0].length;
        int direction = 1;
        boolean traversingRow = true;
        
        for(int r = 0, c = 0, steps = 0; steps < matrix.length * matrix[0].length; steps++){
            
            spiral.add(matrix[r][c]);
            
            if (traversingRow){
                c += direction;
                
                if (c == colMax) {
                    colMax--;
                    traversingRow = !traversingRow;
                    r += direction;
                    c -= direction;
                }
                
            } else {
                r = r + direction;
                
                if (r == rowMax) {
                    rowMax--;
                    traversingRow = !traversingRow;
                    direction *= -1;
                    c += direction;
                    r += direction;
                }
            }
           
        }
        
        
        
        return spiral;
    }
}
