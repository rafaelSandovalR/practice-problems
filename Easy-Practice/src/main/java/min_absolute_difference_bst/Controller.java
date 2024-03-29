/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package min_absolute_difference_bst;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        TreeNode node8 = new TreeNode(23);
        TreeNode node7 = new TreeNode(15);
        TreeNode node6 = new TreeNode(7);
        TreeNode node5 = new TreeNode(1);
        TreeNode node4 = new TreeNode(20, node7,node8);
        TreeNode node3 = new TreeNode(4, node5,node6);
        TreeNode node2 = new TreeNode(10, node3, node4);
        TreeNode root = new TreeNode(25,node2, null);
        
        Solution sol = new Solution();
        
        int min = sol.getMinimumDifference(root);
        
    }
}
