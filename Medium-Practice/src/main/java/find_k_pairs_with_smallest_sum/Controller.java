/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package find_k_pairs_with_smallest_sum;

import java.util.List;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1,2,4,5,6};
        int[] nums2 = {3,5,7,9};
        List<List<Integer>> res = sol.kSmallestPairs(nums1, nums2, 5);
    }
}
