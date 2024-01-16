/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package max_difference_node_ancestor;

/**
 *
 * @author Rsand
 */
public class Controller {
    
    public static void main(String[] args) {
        Solution s = new Solution();

        TreeNode t9 = new TreeNode(13);
        TreeNode t8 = new TreeNode(7);
        TreeNode t7 = new TreeNode(4);
        TreeNode t6 = new TreeNode(14,t9, null);
        TreeNode t5 = new TreeNode(6,t7,t8);
        TreeNode t4 = new TreeNode(1);
        TreeNode t3 = new TreeNode(10, null,t6);
        TreeNode t2 = new TreeNode(3,t4,t5);
        TreeNode root = new TreeNode(8,t2,t3);
        
        System.out.println(s.maxAncestorDiff(root));
    }
    
    

}
