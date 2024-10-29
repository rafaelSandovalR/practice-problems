/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set_matrix_zeroes;

/**
 *
 * @author Rsand
 */
public class Solution {
    public void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];
        
        // Loop to flag the rows and columns containing zeroes
        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
               if (matrix[r][c] == 0){
                   rows[r] = true;
                   cols[c] = true;
               }
            }
        }
        
        
        // Loop to set flagged rows and columns to zeroes
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (rows[r] || cols[c]) {
                    matrix[r][c] = 0;
                }
            }
        }
    }
}
