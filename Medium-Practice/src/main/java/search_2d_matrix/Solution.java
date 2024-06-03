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
        // Starts by doing a binary search of the rows
        return searchRow(matrix, target, 0, matrix.length - 1);
    }
    
    private boolean searchRow(int[][] matrix, int target, int start, int end){
        int n = matrix[0].length - 1;
        int mid = start + (end - start) / 2;
        
        // Check if target falls within range of midpoint row
        if (target >= matrix[mid][0] && target <= matrix[mid][n]){
            // If so, do a binary search on the columns in that row
            return searchColumn(mid, matrix, target, 0, n);
        }
        // Target not found: target is not in the midpoint rows range and theres no more rows to check
        if (start == end) return false; 
        if (target >= matrix[mid][0]) return searchRow(matrix, target, mid + 1, end); // Search bottom half
        else return searchRow(matrix, target, start, mid); // Search top half
    }
    
    private boolean searchColumn(int row, int[][] matrix, int target, int start, int end){
        
        int mid = start + (end - start) / 2;
        
        if (matrix[row][mid] == target) return true; // Target found
        
        if (start == end) return false; // Target not found
        
        // Search first half or second half
        if (target > matrix[row][mid]) return searchColumn (row, matrix, target, mid + 1, end);
        else return searchColumn (row, matrix, target, start, mid);
    }
}
