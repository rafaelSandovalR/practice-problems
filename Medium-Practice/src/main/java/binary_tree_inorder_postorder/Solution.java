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
        
        final int length = inorder.length - 1;
        int[] i = new int[]{ length };
        int[] p = new int[]{ length };
        
        return build(inorder, i, postorder, p, 3001);
        
    }
    
    private TreeNode build(int[] inorder, int[] i, int[] postorder, int[] p, int endVal){
        
        if (p[0] < 0) return null;
        
        else if ( inorder[i[0]] == endVal){
            i[0]--;
            return null;
        }
        
        final int val = postorder[p[0]--];
        final TreeNode root = new TreeNode(val);
        
        root.right = build(inorder, i, postorder, p, val);
        root.left = build(inorder, i, postorder, p, endVal);
        
        return root;
    }
}
