/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package search_2d_matrix;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target){
        return searchRow(matrix, target, 0, matrix.length - 1);
    }
    
    private boolean searchRow(int[][] matrix, int target, int start, int end){
        int n = matrix[0].length - 1;
        int mid = start + (end - start) / 2;
        
        if (target >= matrix[mid][0] && target <= matrix[mid][n]){
            return searchColumn(mid, matrix, target, 0, n);
        }
        if (target >= matrix[mid][0]) return searchRow(matrix, target, mid + 1, end);
        else return searchRow(matrix, target, start, mid);
    }
    
    private boolean searchColumn(int row, int[][] matrix, int target, int start, int end){
        
        int mid = start + (end - start) / 2;
        
        if (matrix[row][mid] == target) return true;
        
        if (start == end) return false;
        
        if (target > matrix[row][mid]) return searchColumn (row, matrix, target, mid + 1, end);
        else return searchColumn (row, matrix, target, start, mid);
    }
}
