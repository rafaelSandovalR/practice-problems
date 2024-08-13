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
        
        // Array references to track current indices in inorder and postorder
        int[] i = new int[]{ length };
        int[] p = new int[]{ length };
        
        // Start building tree with a special end value based off leetcode constraints
        return build(inorder, i, postorder, p, 3001);
        
    }
    
    private TreeNode build(int[] inorder, int[] i, int[] postorder, int[] p, int endVal){
        
        if (p[0] < 0) return null; // Base case: no more elements in postorder
        
        // Base case: reached the end of the current subtree in inorder
        else if ( inorder[i[0]] == endVal){
            i[0]--; // Move to the next element in inorder
            return null;
        }
        
        // Get the root value from postorder and decrement the index
        final int val = postorder[p[0]--];
        final TreeNode root = new TreeNode(val);
        
        // Recursively build the right subtree (endVal remains the same)
        root.right = build(inorder, i, postorder, p, val);
        
        // Recursively build the left subtree (use the original endVal)
        root.left = build(inorder, i, postorder, p, endVal);
        
        return root;
    }
}
