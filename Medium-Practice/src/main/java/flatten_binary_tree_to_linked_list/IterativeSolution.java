/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flatten_binary_tree_to_linked_list;

import java.util.Stack;

/**
 *
 * @author Rsand
 */
public class IterativeSolution {
    public void flatten(TreeNode root){
        if (root == null) return; // Handle empty tree
        
        Stack<TreeNode> stack = new Stack<>(); // Stack to simulate recursion
        stack.push(root); // Start with the root node
        
        TreeNode prev = null; // Keep track of the previously processed node
        
        while (!stack.isEmpty()){
            TreeNode curr = stack.pop(); // Get the current node from the stack
            
            // Connect the current node to the previous node
            if (prev != null){
                prev.right = curr;
                prev.left = null; // Set left pointer to null
            }
            
            // Push the right child first (if exists) to maintain pre-order
            if (curr.right != null) stack.push(curr.right);
            // Push left child (if exists)
            if (curr.left != null) stack.push(curr.left);
            
            prev = curr; // Update the previous node for the next iteration
        }
    }
}
