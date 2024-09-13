/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maximum_sum_circular_subarray;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        int[] nums = {1,-2,3,-2};
        Solution2 sol = new Solution2();
        int maxSubArray = sol.maxSubarraySumCircular(nums);
    }
}
