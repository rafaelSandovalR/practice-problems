/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary_tree_inorder_postorder;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        TreeNode x15 = new TreeNode(0);
//        TreeNode x14 = new TreeNode(11);
//        TreeNode x13 = new TreeNode(-1);
//        TreeNode x12 = new TreeNode(10, x15, null);
//        TreeNode x11 = new TreeNode(14);
//        TreeNode x10 = new TreeNode(13);
//        TreeNode x9 = new TreeNode(4);
//        TreeNode x8 = new TreeNode(9);
//        TreeNode x7 = new TreeNode(7, null, x14);
//        TreeNode x6 = new TreeNode(8,x12,x13);
//        TreeNode x5 = new TreeNode(12, x10,x11);
//        TreeNode x4 = new TreeNode(3, x8, x9);
//        TreeNode x3 = new TreeNode(5, x6,x7);
//        TreeNode x2 = new TreeNode(6, x4,x5);
//        TreeNode x1 = new TreeNode(2, x2,x3);

        int[] inorder   = {9,3,4,6,13,12,14,2,0,10,8,-1,5,7,11};
        int[] postorder = {9,4,3,13,14,12,6,0,10,-1,8,11,7,5,2}; 
    
        TreeNode root = sol.buildTree(inorder, postorder);
    }
}
