/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flatten_binary_tree_to_linked_list;

/**
 *
 * @author Rsand
 */
public class Solution {
    public void flatten(TreeNode root){
        if (root != null) traverse(root);
    }
    
    private TreeNode traverse(TreeNode root){
        
        // Base case: if the node is a leaf, return it
        if (root.left == null && root.right == null) return root;
        // If no left child, traverse right subtree and return last node
        if (root.left == null) return traverse(root.right);

        
        TreeNode detached = root.right; // Detach right branch and store it
        
        // Connect left branch to right pointer and set left pointer to null
        root.right = root.left;
        root.left = null;

        // Traverse the (now modified) right subtree and get the last node
        TreeNode lastProcessed = traverse(root.right);
        
        if (detached != null){ // If there was a detached right subtree, reattach it
            lastProcessed.right = detached;
            return traverse(detached); // Return last node in detached subtree
        } else{
            return lastProcessed; // Return the last node
        }
    }
}
