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
    int p = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder){
        
        p = postorder.length - 1;
        return getNode(inorder, postorder, 0, p);
    }
    
    private TreeNode getNode(int[] io, int[] po, int start, int end){
        
        if (end < start) return null;
        
        TreeNode root = new TreeNode( po[p--] );
        
        int idx = start;
        while (io[idx] != root.val){
            idx++;
        }
        
        root.right = getNode(io, po, idx+1,  end);
        root.left = getNode(io, po, start, idx-1);

        
        return root;
    }
}
