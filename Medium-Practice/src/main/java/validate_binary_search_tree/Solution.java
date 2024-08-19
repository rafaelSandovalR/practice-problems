/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validate_binary_search_tree;

import java.util.LinkedList;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean isValidBST(TreeNode root){
        var stack = new LinkedList<Integer>();

        return scanTree(root, stack);
    }
    
    public boolean scanTree(TreeNode root, LinkedList<Integer> stack){
        
        if (root == null) return true;
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        boolean leftValid, rightValid;
        
        if (stack.isEmpty()) stack.push(root.val);
        
        if (left != null && left.val < root.val){
            
            if (stack.size() > 1 && left.val > stack.get(1)){
                stack.push(left.val);
                leftValid = scanTree(left, stack);
            }

        }
        
        if (right != null && right.val > root.val){
            
            if (stack.size() > 1 && right.val < stack.get(1)){
                stack.push(right.val);
                
            }

        } 
    }
}
