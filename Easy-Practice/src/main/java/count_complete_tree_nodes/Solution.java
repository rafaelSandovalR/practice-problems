/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package count_complete_tree_nodes;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int countNodes(TreeNode root){
        if (root == null) return 0; // If Tree is empty, there are no nodes
        
        int height = getHeight(root); // Calculate height
        
        int missingNodes = getMissing(root, height - 1); // Calculate missing nodes in last level
        
        // Calculate the total number of nodes in a perfect binary tree of the same height
        int perfectTree = 0;
        for (int exp = 0; exp < height; exp++){
            perfectTree += Math.pow(2, exp);
        }
        
        // Subtract missing nodes from the amount a perfect tree would have
        return perfectTree - missingNodes;
    }
    
    private int getMissing(TreeNode root, int height){
        
        // When second to last level is reached, check if left and right child are missing
        if (height == 1){
            return root.left == null ? 2 : root.right == null ? 1 : 0;
        }
        
        // Recursively calculate the number of missing nodes in right subtree
        int missingRight = getMissing(root.right, height - 1);
        
        // Only calculate missing nodes in left subtree if right subtree is missing nodes
        // because in a complete binary tree the last level is filled from left to right
        int missingLeft = missingRight > 0 ? getMissing(root.left, height - 1) : 0;
        
        // Return the total number of missing nodes in both subtrees
        return missingRight + missingLeft;
    }
    
    // Recursively calculates the height of the tree
    private int getHeight(TreeNode root){
        if (root == null) return 0;
        
        // Height is determined by deepest left-most node
        return 1 + getHeight(root.left);
    }
}
