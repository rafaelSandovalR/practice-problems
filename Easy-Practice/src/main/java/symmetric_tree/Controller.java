/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package symmetric_tree;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(3);
        TreeNode node6 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        TreeNode node4 = new TreeNode(3);
        TreeNode node3 = new TreeNode(2,node6,node7);
        TreeNode node2 = new TreeNode(2,node4,node5);
        TreeNode root  = new TreeNode(1,node2, node3);
        
        Solution sol = new Solution();
        boolean symmetricTree = sol.isSymmetric(root);
    }
}
