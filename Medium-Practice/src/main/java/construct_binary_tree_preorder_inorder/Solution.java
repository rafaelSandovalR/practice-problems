/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package construct_binary_tree_preorder_inorder;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Rsand
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder){
        
        if (preorder.length == 0) return null;
        
        ArrayList<Integer> leftPreOrder = new ArrayList<Integer>();
        ArrayList<Integer> leftInOrder = new ArrayList<Integer>();
        ArrayList<Integer> rightPreOrder = new ArrayList<Integer>();
        ArrayList<Integer> rightInOrder = new ArrayList<Integer>();
        
        int root = preorder[0];
        int leftChild, rightChild;
        
        // Create inorder list for left subtree
        int idx = 0;
        while (inorder[idx] != root){
            leftInOrder.add(inorder[idx]);
            idx++;
        }
        
        // Skip root node
        idx++;
        
        // Create inorder list for right subtree
        while (idx < inorder.length){
            rightInOrder.add(inorder[idx]);
            idx++;
        }
        
        // Create preorder lists for both branches
        for (int i = 1; i < preorder.length; i++){
            if (leftInOrder.contains(preorder[i])){
                leftPreOrder.add(preorder[i]);
            } else {
                rightPreOrder.add(preorder[i]);
            }
        }
        
        // Convert ArrayLists to arrays
        int[] leftpreorder = new int[leftPreOrder.size()];
        Arrays.setAll(leftpreorder, leftPreOrder::get);
        
        int[] leftinorder = new int[leftInOrder.size()];
        Arrays.setAll(leftinorder, leftInOrder::get);
        
        int[] rightpreorder = new int[rightPreOrder.size()];
        Arrays.setAll(rightpreorder, rightPreOrder::get);
        
        int[] rightinorder = new int[rightInOrder.size()];
        Arrays.setAll(rightinorder, rightInOrder::get);
        
        
        
        return new TreeNode(root, buildTree(leftpreorder,leftinorder),buildTree(rightpreorder,rightinorder));
        }
}
