/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kth_smallest_element_in_bst;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    public int kthSmallest(TreeNode root, int k) {
        int[] answer = new int[1];
        helper(root, k, answer);
        return answer[0];
    }

    private int helper(TreeNode root, int k, int[] index) {
        if (root == null) return k;
        if (k == 0) return 0;
            
        k = helper(root.left, k, index);

        if (k == 1) index[0] = root.val;

        k = helper(root.right, --k, index);

        return k;
    }
}
