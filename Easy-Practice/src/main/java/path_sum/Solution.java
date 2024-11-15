/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package path_sum;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum){
        // If current node is null (and targetSum has not reached zero) there is no path
        if (root == null) return false;
        
        // Subtract the current node's value from the target sum
        targetSum -= root.val;
        
        // If targetSum has reached zero and current node is a leaf, path with target sum has been found
        if (targetSum == 0 && root.left == null && root.right == null) return true;
        
        // Recursively check if a path with remaining target sum exists in left & right subtrees
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
