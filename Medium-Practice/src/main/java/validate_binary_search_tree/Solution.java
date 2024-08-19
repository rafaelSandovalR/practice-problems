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
        stack.push(root.val);
        return isValid(root.left, stack, true) && isValid(root.right, stack, false);
    }
    
    private boolean isValid(TreeNode root, LinkedList<Integer> stack, boolean leftBranch){
        
        if (root == null) return true;
        
        if (leftBranch){
            if (root.val > stack.peek()) return false;
            if (stack.size() > 1 && stack.peek() > stack.get(1) && root.val < stack.get(1)) return false;
        } else{
            if (root.val < stack.peek()) return false;
            if (stack.size() > 1 && stack.peek() > stack.get(1) && root.val > stack.get(1)) return false;
        }
        
        stack.push(root.val);
        
        boolean validSubTree = isValid(root.left, stack, true) && isValid(root.right, stack, false);
        
        stack.pop();
        
        return validSubTree;
    }
}
