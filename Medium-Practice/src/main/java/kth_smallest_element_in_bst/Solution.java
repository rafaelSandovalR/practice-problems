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
        if (root == null) return 0;
        int left = kthSmallest(root.left, k);
        if (left == k) return root.left.val;
        int right = kthSmallest(root.right,k) + left;
        if (right == k) return root.right.val;
        return left+right+1;
    }
}
