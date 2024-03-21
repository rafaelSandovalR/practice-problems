/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package construct_binary_tree_preorder_inorder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder){
        
        List<Integer> leftPreOrder = new ArrayList<Integer>();
        List<Integer> leftInOrder = new ArrayList<Integer>();
        List<Integer> rightPreOrder = new ArrayList<Integer>();
        List<Integer> rightInOrder = new ArrayList<Integer>();
        
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
        
        return null;
        //buildTree();
        }
}
