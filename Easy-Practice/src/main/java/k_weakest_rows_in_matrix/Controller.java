/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package k_weakest_rows_in_matrix;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution s = new Solution();
        
        int[][] arr = {{1, 1, 0, 0}, {1, 1, 1, 1}, {0, 0, 0, 0}, {1, 0, 0, 0}};
        
        int[] ranks = s.kWeakeastRows(arr, 2);
        
        System.out.println(ranks.toString());
    }
}
