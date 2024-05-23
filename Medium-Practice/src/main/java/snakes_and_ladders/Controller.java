/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakes_and_ladders;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        BFS_Solution sol = new BFS_Solution();
        BFS_Deque_Solution sol2 = new BFS_Deque_Solution();
        
        int[][] emptyBoard = {  {-1, -1, -1, -1},
                                {-1, -1, -1, -1},
                                {-1, -1, -1, -1},
                                {-1, -1, -1, -1}};
        
        int[][] board = {{-1, -1, -1, -1},
                         {-1, -1, -1,  5},
                         { 2, 12, -1, -1},
                         {-1, -1, -1, 13}};
        int result = sol2.snakesAndLadders(emptyBoard);
        System.out.println(result);
    }
}
