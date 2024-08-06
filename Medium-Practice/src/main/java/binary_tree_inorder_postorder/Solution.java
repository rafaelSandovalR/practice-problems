/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary_tree_inorder_postorder;

/**
 *
 * @author Rsand
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder){
        
        return getNode(inorder, postorder, postorder.length, true);
    }
    
    private TreeNode getNode(int[] io, int[] po, int len, boolean left){
        
        if (len == 0) return null;
        
        TreeNode root = left
                ? new TreeNode(po[len - 1])
                : len > 2
                        ? new TreeNode(po[len - 2])
                        : null;
        
        if (root == null) return null;
        
        int LPI = 0;
        while (io[LPI] != root.val){
            LPI++;
        }
        
        root.left = getNode(io, po, LPI, true);
        root.right = getNode(io, po, LPI, false);
        
        return root;
    }
}
