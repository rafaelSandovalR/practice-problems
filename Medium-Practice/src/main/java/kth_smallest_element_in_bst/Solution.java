/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kth_smallest_element_in_bst;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int kthSmallest(TreeNode root, int k){
        // base case
        if (root == null) return 0;
        // for in order traversal, go as far deep left as possible
        int left = kthSmallest(root.left, k);
        if (left == k) return root.left.val;
        if (left + 1 == k) return root.val;
        // traverse right side
        int right = kthSmallest(root.right,k);
        if (right + left == k) return root.right.val;
        // add up left and right subbranches plus the current node
        return left+right+1;
    }
}
