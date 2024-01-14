/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package max_difference_node_ancestor;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int maxAncestorDiff(TreeNode root){
        int maxVal = 0;
        int leftMax = 0;
        int leftMin = 0;
        int rightMax = 0; 
        int rightMin = 0;
        
        if(root == null){ return 0; }
        if(root.left == null){ leftMax = 0; leftMin = 0;}
        else{ 
            leftMin = Math.min(root.val, root.left.val);
            leftMax = Math.max(root.val, root.left.val);
        }
        if(root.right == null){ rightMax = 0; rightMin = 0;}
        else{
            rightMin = Math.min(root.val, root.right.val);
            rightMax = Math.min(root.val, root.right.val);
        }

        maxVal = Math.max(leftMax-leftMin, rightMax=rightMin);
        
        /*
        THOUGHTS
        
        - Need to make two recursive calls with left node and right node.
        = Need to return max difference 
        
           1
         2   3
        4 5 6 7
        
        
        */
        
        return maxVal;
    }
}
