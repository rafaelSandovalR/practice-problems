/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kth_smallest_element_in_bst;

import java.util.ArrayDeque;

/**
 *
 * @author Rsand
 */
public class Solution {
    
    public int kthSmallest(TreeNode root, int k){
                
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        TreeNode node = null;
        
        // Add root and all surface level left nodes to stack
        while(root != null){
            stack.push(root);
            root = root.left;
        }
        
        while (k > 0){
            node = stack.pop();
            
            // Add right child to stack, if any
            if (node.right != null){
                stack.push(node.right);
                root = stack.peek().left;
                // From this point down, add all surface level left nodes to stack
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
            }
            k--;
        }
        
        return node.val;
    }
    
}
