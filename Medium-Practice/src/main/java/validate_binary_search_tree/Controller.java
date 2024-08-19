/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validate_binary_search_tree;

/**
 *
 * @author Rsand
 */
public class Controller {
    
    public static void main(String[] args) {

        TreeNode node7 = new TreeNode(6);
        TreeNode node6 = new TreeNode(4);
        TreeNode node5 = new TreeNode(2);
        TreeNode node4 = new TreeNode(0);
        TreeNode node3 = new TreeNode(5, node6, node7);
        TreeNode node2 = new TreeNode(1, node4, node5);
        TreeNode root = new TreeNode(3, node2, node3);

        Solution sol = new Solution();
        
        boolean result = sol.isValidBST(root);
    }

}
