/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakes_and_ladders;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Rsand
 */
public class Solution {
    /*
    // BFS Solution
    public int snakesAndLadders(int[][] board){
        int n = board.length;
        Queue<Integer> queue = new LinkedList<>(); // Stores squares to be explored (BFS)
        queue.offer(1); // Add starting square
        boolean[] visited = new boolean[n * n + 1]; // Track explored squares
        
        
        for (int move = 0; !queue.isEmpty(); move++){ // Loop until the queue is empty (all possibilities explored)
            
            for (int size = queue.size(); size > 0; size--){ // Explore all squares in the current level (based on previous roll distances)
                int num = queue.poll();
                if (visited[num]) continue; // Skip already explored squares
                visited[num] = true;
                if (num == n * n) return move; // If end is reached, return number of moves taken
                
                for (int i = 1; i <= 6 && num + i <= n * n; i++){ // Explore all possible next squares based on 6 sided dice roll
                    int next = num + i;
                    int value = getBoardValue(board, next); // Get the actual square value considering Boustrophedon style
                    if (value > 0) next = value; // Handles snake or ladder
                    if (!visited[next]) queue.offer(next); // Add the next square to queue for exploration (if not already visited)
                }
            }
        }

        return -1; // Return -1 if last square is not reached
    }
  
    // Function to convert square number to actual row & column considering Boustrophedon style
    private int getBoardValue(int[][] board, int num) {
        int n = board.length;
        int r = (num - 1) / n; // Row number
        int x = n - 1 - r; // Actual row index based on Boustophedon style
        int y = r % 2 == 0 ? (num - 1 - r * n) : (n + r * n - num); // Column index based on even/odd row
        return board[x][y];
    }
    
    */

    // DFS Solution
    int res = -1; // Minimum number of moves found
    public int snakesAndLadders(int[][] board){
        int n = board.length;
        dfs(board, new LinkedList<Integer>(){{add(1);}}, new boolean[n * n + 1], 0, n);
        return res;
    }
    
    private void dfs(int[][] board, List<Integer> curr, boolean[] visited, int move, int n){
        if(curr.isEmpty()) return; // Base case: No more paths to explore
        
        List<Integer> nextList = new LinkedList<>(); // Stores next squares to explore
        
        for (int i : curr){ // Loop througb all squares in the current list
            if (visited[i]) continue; // Skip already explored squares
            visited[i] = true; // Mark the current square as visited
            
            if (i == n * n){ // Check if final square is reached
                res = move;
                return;
            }
            
            for (int j = 1; j <= 6 && i + j <= n*n; j++){ // Explore all possible next squares based on dice roll
                int next = i + j;
                int value = getBoardValue(board, next);
                if (value > 0) next = value; // Handle snake or ladder
                if (!visited[next]) nextList.add(next); // Add next square to exploration list if not visited
            }
        }
        dfs(board, nextList, visited, move + 1, n); // revursively explore next squares (DFS)
        
        // **Important for DFS:** Backtrack after exploring all possibilities from the current square
        // This ensures exploration continues on other branches of the search tree
        return; 
        
    }

    private int getBoardValue(int[][] board, int num) {
        int n = board.length;
        int r = (num - 1) / n; // Row number
        int x = n - 1 - r; // Actual row index based on Boustophedon style
        int y = r % 2 == 0 ? (num - 1 - r * n) : (n + r * n - num); // Column index based on even/odd row
        return board[x][y];
    }
    
}
