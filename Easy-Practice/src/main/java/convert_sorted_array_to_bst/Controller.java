/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convert_sorted_array_to_bst;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        
        int[] nums = {-10, -3, 0, 5, 9};
        Solution sol = new Solution();
        TreeNode ans = sol.sortedArrayToBST(nums);
    }
}
