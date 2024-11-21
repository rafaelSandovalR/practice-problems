/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sum_root_to_leaf_numbers;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int sumNumbers(TreeNode root){
        
        // Represents a complete root-to-leaf path, return value (which is the sum up to this point)
        if (root.left == null && root.right == null) return root.val;
        
        int sum = 0; // Sum of all root-to-leaf path numbers
        int reset;
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        // Process left subtree
        if (left != null){
            reset = left.val; // Stores original value of left child
            left.val = (root.val * 10) + left.val; // Update left child to include current node's value
            sum += sumNumbers(left); // Recursively calc the sum of numbers in left subtree
            left.val = reset; // Reset left child's value to its original value
        }
        
        // Process right subtree (same as left)
        if (right != null){
            reset = right.val; 
            right.val = (root.val * 10) + right.val; 
            sum += sumNumbers(right); 
            right.val = reset;
        }
        
        return sum; // Return total sum of all root-to-leaf path numbers
    }
    
    
}
