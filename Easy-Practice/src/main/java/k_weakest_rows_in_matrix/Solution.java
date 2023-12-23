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
        int nextRank = mat.length;
        
        //i goes down the rows, j goes backwards across the columns
        for(int j = mat[0].length-1; j >= 0; j--){

            for (int i = 0; i < mat.length; i++) {
                //Find the strongest rows
                if (mat[i][j] == 1 && ranks[i] < nextRank) {
                    ranks[i] = nextRank;
                    nextRank--;
                } 
                else if(j == 0 && nextRank >= 0 ){
                    ranks[i] = nextRank;
                    nextRank--;
                }
            }
            
        }
        

        
        //placeholder
        return ranks;
    }
}
