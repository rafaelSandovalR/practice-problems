/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maximum_sum_circular_subarray;

/**
 *
 * @author Rsand
 */
class Solution3 {

    int total;

    public int maxSubarraySumCircular(int[] nums) {
        int max = count(nums, true);
        int min = count(nums, false);

        return max < 0 ? max : Math.max(total - min, max);
    }

    public int count(int[] nums, boolean max) {
        total = nums[0];
        int maxSum = nums[0];
        int curSum = nums[0];
        for (int s = 1; s < nums.length; s++) {
            total += nums[s];

            if (max) {
                curSum = Math.max(nums[s], curSum + nums[s]);
                maxSum = Math.max(maxSum, curSum);
            } else {
                curSum = Math.min(nums[s], curSum + nums[s]);
                maxSum = Math.min(maxSum, curSum);
            }
        }

        return maxSum;
    }
}
