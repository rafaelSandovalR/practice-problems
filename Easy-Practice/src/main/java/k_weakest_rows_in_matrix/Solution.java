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

        //array to hold ranks; 1 being the weakest
        int[] ranks = new int[mat.length];
        int nextRank = mat.length;

        
        //i goes up the rows, j goes backwards across the columns
        for(int j = mat[0].length-1; j >= 0; j--){

            for (int i = mat.length-1; i >= 0; i--) {
                //Find the strongest rows
                if (mat[i][j] == 1 && ranks[i] < nextRank) {
                    ranks[i] = nextRank;
                    nextRank--;
                } 
            }
        }
        
        //loop to rank any rows with all zeros
        for(int i = ranks.length-1; nextRank > 0 && i >= 0; i--){
            if(ranks[i] < nextRank){
                ranks[i] = nextRank;
                nextRank--;
            }
        }
        
        int[] kWeakest = new int[k];

        //loop to order rows based on ranks in kWeakest variable
        for(int i = 0; i < k; i++){
            for(int j = 0; j < ranks.length; j++){
                if(i+1 == ranks[j]){
                    kWeakest[i] = j;
                }
            }
        }


        return kWeakest;
    }
}
