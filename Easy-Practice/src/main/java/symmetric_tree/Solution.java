/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package symmetric_tree;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean isSymmetric(TreeNode root){
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }
    
    private boolean isMirror(TreeNode leftNode, TreeNode rightNode){
        if (leftNode == null || rightNode == null){
            return leftNode == rightNode;
        }
        
        if (leftNode.val != rightNode.val) return false;      
        return isMirror(leftNode.left, rightNode.right) && isMirror(leftNode.right, rightNode.left);
    }
}
