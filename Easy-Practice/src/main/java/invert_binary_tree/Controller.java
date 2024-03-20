/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invert_binary_tree;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(1);
        TreeNode root = new TreeNode(2, node2, node3);
        
        Solution sol = new Solution();
        
        TreeNode inverted = sol.invertTree(root);
    }
}
