/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package construct_binary_tree_preorder_inorder;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author Rsand
 */
public class Solution {
    int i = 0;
    int p = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder){
        return build(preorder, inorder, Integer.MIN_VALUE);        
    }
    
    public TreeNode build(int[] preorder, int[]inorder, int stop){
        if (p >= preorder.length) return null;
        
        if (inorder[i] == stop){
            i++; 
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[p++]);
        root.left = build(preorder, inorder, root.val);
        root.right = build(preorder, inorder, stop);
        return root;
    }
}