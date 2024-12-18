/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jump_game_ii;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int jump(int[] nums){
        int ptr = 0;
        int lastCell = nums.length - 1;
        int jumps = 0;
        
        while (ptr < lastCell) {
            int potential = ptr; // Holds farthest reach; its own index + cell value (jumps);
            int potIdx = ptr; // Index of cell with the farthest reach

            // Loop through each possible jumps from current pointer
            for (int i = nums[ptr]; i > 0; i--) {
                int candidate = ptr + i; // Pointer + jumps

                // If last cell can be reached with i amount of jumps
                if (candidate >= lastCell) {
                    potIdx = candidate; // Update furthest-potential index
                    break;
                }

                // Find candidate with the farthest potential reach
                if (candidate + nums[candidate] > potential) {
                    // Update variables
                    potIdx = candidate;
                    potential = candidate + nums[candidate];
                }
            }

            // Change pointer to index with the furthest potential
            ptr = potIdx;
            jumps++; // Update number of jumps
        }

        return jumps;
    }
}
