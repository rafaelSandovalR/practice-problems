/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convert_sorted_array_to_bst;

/**
 *
 * @author Rsand
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums){
        return buildBST(nums, 0, nums.length - 1);
    }
    
    private TreeNode buildBST(int[] nums, int lowerBound, int upperBound){
        if (lowerBound > upperBound) return null;
        int mid = (lowerBound + upperBound) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = buildBST(nums, lowerBound, mid - 1);
        root.right = buildBST(nums, mid + 1, upperBound);
        
        return root;
    }
}
