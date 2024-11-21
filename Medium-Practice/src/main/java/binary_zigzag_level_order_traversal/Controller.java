/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary_zigzag_level_order_traversal;

import java.util.List;
import sum_root_to_leaf_numbers.*;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution sol = new Solution();
        TreeNode n5 = new TreeNode(7);
        TreeNode n4 = new TreeNode(15);
        TreeNode n3 = new TreeNode(20,n4,n5);
        TreeNode n2 = new TreeNode(9);
        TreeNode root = new TreeNode(3,n2,n3);
        
        List ans = sol.zigzagLevelOrder(root);
    }
}
