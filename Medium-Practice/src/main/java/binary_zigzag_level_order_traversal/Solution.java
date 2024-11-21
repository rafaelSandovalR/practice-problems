/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary_zigzag_level_order_traversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res; // Base case: empty input
        
        Deque<TreeNode> level = new ArrayDeque<>(); // Deque used as a stack for each level
        level.add(root); // Initialize with root
        
        boolean zigzag = false; // Used to switch direction of adding children for next level
        
        while (!level.isEmpty()){
            int n = level.size();
            List<Integer> sub = new ArrayList<>(); // Sublist for each level
            Deque<TreeNode> nextLevel = new ArrayDeque<>(); // Stack for next levels
            
            for (int i = 0; i < n; i++){
                TreeNode node = level.pollFirst(); // Get top of stack
                sub.add(node.val); // Add value to current sublist
                
                // Alternate each level
                if (zigzag){
                    // Zig: Add children from right to left;
                    if (node.right != null) nextLevel.push(node.right);
                    if (node.left != null) nextLevel.push(node.left);
                    
                } else{
                    // Zag: Add children from left to right
                    if (node.left != null) nextLevel.push(node.left);
                    if (node.right != null) nextLevel.push(node.right);

                }
            }
            res.add(sub); // Add sublist to main list
            zigzag = !zigzag; // Switch direction
            level = nextLevel; // Go to next level
        }
        
        return res;
    }
}
