/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package max_depth_binary_tree;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int maxDepth(TreeNode root){
        if (root == null) return 0;
        
        return Math.max(maxDepth(root.left), maxDepth(root.right))  + 1;
    }
}
