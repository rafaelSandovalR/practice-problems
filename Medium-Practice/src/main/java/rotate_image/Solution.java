/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotate_image;

/**
 *
 * @author Rsand
 */
public class Solution {
    public void rotate(int[][] matrix){
        int n = matrix.length;
        
        // Transpose the matrix (swap elements across the main diagonal
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){ // Start from i+1 to avoid double-swapping
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Reverse each row of the transposed matrix
        for (int i = 0; i < n; i++){
            // Iterate until the middle of the row
            for (int j = 0; j < n / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

}
