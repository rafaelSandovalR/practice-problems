/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package construct_binary_tree_preorder_inorder;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution sol = new Solution();
        /*
        int[] preorder = {9,1,2,4,7,3,8,11,6,13,15,14,5,10,12};
        int[] inorder = {11,4,6,1,7,10,13,12,9,15,3,14,2,8,5};
        */
        
        int[] preorder = {1,4,2,3};
        int[] inorder = {1,2,3,4};
        
        TreeNode binaryTree = sol.buildTree(preorder, inorder);
 
        
        
    }
}
