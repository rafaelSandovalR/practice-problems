/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aa_testing;

/**
 *
 * @author Rsand
 */
class Solution {

    public int searchInsert(int[] nums, int target) {

        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int start, int end) {
        int mid = (start + end) / 2;
        int curr = nums[mid];

        if (target == curr) {
            return mid;
        }
        if (start >= end) {
            return target < curr ? mid : mid + 1;
        }
        if (target < curr) {
            return search(nums, target, start, mid - 1);
        }
        return search(nums, target, mid + 1, end);
    }
}
