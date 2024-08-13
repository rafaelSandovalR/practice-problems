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

        int[] inorder   = {9,3,4,6,13,12,14,2,0,10,8,-1,5,7,11};
        int[] postorder = {9,4,3,13,14,12,6,0,10,-1,8,11,7,5,2}; 
    
        TreeNode root = sol.buildTree(inorder, postorder);
    }
}
