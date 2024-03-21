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
        
        int[] preorder = {3,9,20,2,8,15,7,5,6,4,1,16};
        int[] inorder = {5,2,9,8,3,6,15,4,20,1,7,16};
        
        TreeNode binaryTree = sol.buildTree(preorder, inorder);
 
        
        
    }
}
