/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flatten_binary_tree_to_linked_list;

/**
 *
 * @author Rsand
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val) { this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right ) { this.val = val; this.left = left; this.right = right;}
}
