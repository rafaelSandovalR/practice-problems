/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jump_game;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean canJump(int[] nums){
        
        int ptr = 0;
        int lastCell = nums.length-1;
        
        while (ptr < lastCell){
            int potential = ptr; // Holds farthest reach; its own index + cell value (jumps);
            int potIdx = ptr; // Index of cell with the farthest reach
            
            // Loop through each possible jumps from current pointer
            for (int i = nums[ptr]; i > 0; i--){
                int candidate = ptr + i; // Pointer + jumps
                
                // If last cell can be reached with i amount of jumps
                if (candidate >= lastCell) return true;
                
                // Find candidate with the farthest potential reach
                if (candidate + nums[candidate] > potential){
                    // Update variables
                    potIdx = candidate;
                    potential = candidate + nums[candidate];
                }
            }
            // If the farthest potential reach is no further than the current cell
            // and the last cell hasn't been reached, then last cell is unreachable
            if (ptr == potIdx) return false;
            
            // Otherwise, change pointer to index with the furthest potential
            ptr = potIdx;
        }
        
        return true;
    }
    
    public boolean canJump2(int[] nums){
        int goal = nums.length - 1; // The goal is to reach the final index
        
        // Iterate through all nums from the end backwards
        for (int i = goal - 1; i >= 0; i--){
            
            // If there is an index which holds a value (jumps) that reaches the goal
            if (i + nums[i] >= goal){
                goal = i; // Set the new goal to be this index
            }
        }
        
        return goal == 0; // If goal has been replaced all the way to index 0, then there exists a path from beginning to end
    }
}
