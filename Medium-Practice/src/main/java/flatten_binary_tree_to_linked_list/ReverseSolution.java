/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flatten_binary_tree_to_linked_list;

/**
 *
 * @author Rsand
 */
public class ReverseSolution {
    TreeNode prev = null; // Global variable to track the head of the previously flattened nodes
    
    // 
    public void flatten(TreeNode root){
        if (root == null) return; // Base case: empty tree
        
        flatten(root.right); // Recursively flatten the right subtree first
        flatten(root.left); // Recursively flatten the left subtree
        
        root.right = prev;  // Connect the current node to the previously flatten nodes
        root.left = null;   // Set the left child to null
        prev = root;        // Update prev to current node
    }
}
