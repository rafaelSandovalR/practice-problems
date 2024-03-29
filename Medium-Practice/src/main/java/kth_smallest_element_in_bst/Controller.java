/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kth_smallest_element_in_bst;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        TreeNode node6 = new TreeNode(1);
        TreeNode node5 = new TreeNode(4);
        TreeNode node4 = new TreeNode(2,node6, null);
        TreeNode node3 = new TreeNode(6);
        TreeNode node2 = new TreeNode(3,node4,node5);
        TreeNode root = new TreeNode(5,node2,node3);
        
        Solution sol = new Solution();
        
        int output = sol.kthSmallest(root, 3);
    }
}
