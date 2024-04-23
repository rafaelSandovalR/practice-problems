/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakes_and_ladders;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int snakesAndLadders(int[][] board){
        int n = board.length;
        int[] curr = {n-1, 0};
        int lastColumn = n % 2 == 0 ? 0 : n-1; // Determine if last cell is on the left or right side based on even or odd rows
        
        while (curr[0] != 0 && curr[1] != lastColumn){
            
        }
    }
}
