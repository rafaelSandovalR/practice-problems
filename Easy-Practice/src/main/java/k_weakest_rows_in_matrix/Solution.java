/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package k_weakest_rows_in_matrix;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int[] kWeakeastRows(int[][] mat, int k){
        //Weakest possible row is all 0s
        //Start at the end of each 
        //Variable to hold next rank 
        //Array to hold ranks
        //int[row][column]
        
        int[] ranks = new int[mat.length];
        int nextRank;
        
        //i goes down the rows, j goes backwards across the columns
        for(int i = 0, j = mat[0].length-1; i < mat.length; i++, j--){
            
        }
    }
}
