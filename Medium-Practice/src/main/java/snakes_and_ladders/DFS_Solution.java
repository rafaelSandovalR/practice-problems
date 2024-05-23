/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakes_and_ladders;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class DFS_Solution {
    // DFS Solution

    int res = -1; // Minimum number of moves found

    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        dfs(board, new LinkedList<Integer>() {
            {
                add(1);
            }
        }, new boolean[n * n + 1], 0, n);
        return res;
    }

    private void dfs(int[][] board, List<Integer> curr, boolean[] visited, int move, int n) {
        if (curr.isEmpty()) {
            return; // Base case: No more paths to explore
        }
        List<Integer> nextList = new LinkedList<>(); // Stores next squares to explore

        for (int i : curr) { // Loop througb all squares in the current list
            if (visited[i]) {
                continue; // Skip already explored squares
            }
            visited[i] = true; // Mark the current square as visited

            if (i == n * n) { // Check if final square is reached
                res = move;
                return;
            }

            for (int j = 1; j <= 6 && i + j <= n * n; j++) { // Explore all possible next squares based on dice roll
                int next = i + j;
                int value = getBoardValue(board, next);
                if (value > 0) {
                    next = value; // Handle snake or ladder
                }
                if (!visited[next]) {
                    nextList.add(next); // Add next square to exploration list if not visited
                }
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
