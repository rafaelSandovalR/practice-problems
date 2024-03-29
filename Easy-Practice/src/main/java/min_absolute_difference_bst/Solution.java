/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package min_absolute_difference_bst;

/**
 *
 * @author Rsand
 */
public class Solution {
    int min = Integer.MAX_VALUE;
    Integer prev = null;
    
    public int getMinimumDifference(TreeNode root){
        
        if (root == null)  return min;
        
        // Visit all smaller nodes first
        getMinimumDifference(root.left);
        
        // If it's visited at least one node
        if (prev != null) {
            min = Math.min(min, root.val - prev); // Since in order traversal. Prev will always be less than root
        }
        
        prev = root.val;

        // Visit right branches
        getMinimumDifference(root.right);

        return min;
    }
    
}
