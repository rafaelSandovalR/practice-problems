/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package average_levels_binary_tree;

import java.util.List;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(7);
        TreeNode node4 = new TreeNode(15);
        TreeNode node3 = new TreeNode(20,node4,node5);
        TreeNode node2 = new TreeNode(9);
        TreeNode root = new TreeNode(3, node2, node3);
        
        Solution sol = new Solution();
        List<Double> answer = sol.averageOfLevels(root);
    }
   
}
