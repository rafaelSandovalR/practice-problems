/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package count_complete_tree_nodes;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        TreeNode x6 = new TreeNode(6);
        TreeNode x5 = new TreeNode(5);
        TreeNode x4 = new TreeNode(4);
        TreeNode x3 = new TreeNode(3, x6, null);
        TreeNode x2 = new TreeNode(2, x4,x5);
        TreeNode x1 = new TreeNode(1, x2, x3);
        
        Solution sol = new Solution();
        int res = sol.countNodes(x1);
        
    }
}
