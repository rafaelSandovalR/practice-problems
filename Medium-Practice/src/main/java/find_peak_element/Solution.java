/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package find_peak_element;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int findPeakElement(int[] nums){
        int n = nums.length;
        // Early termination cases:
        // Case 1: Single number means that is the peak
        // Case 2: Two numbers, the biggest number is the peak
        if (n == 1) return 0;
        if (n == 2) return nums[0] > nums[1] ? 0 : 1;

        return findPeakIndex(nums, 0, nums.length-1);
        
    }
    
    
    // Helper recursive method to find peak index with binary search
    private int findPeakIndex(int[] nums, int start, int end){
        
        int n = nums.length;
        // Set indices
        int mid = (start + end) / 2;
        int left = mid - 1;
        int right = mid + 1;
        
        // Current value in spotlight
        int midValue = nums[mid];
        
        // Handle arriving at either end of array
        if (left < 0) {
            // If arrived at left end, the peak is the max of it and its right neighbor
            return midValue > nums[right] ? mid : right;
        }

        if (right == n) {
            // If arrived at right end, the peak is the max of it and its left neighbor
            return midValue > nums[left] ? mid : left;
        }
        
        // If neighbors are both less than the current value, it is a peak
        if (midValue > nums[left] && midValue > nums[right]) return mid;
        
        // If current value is greater than left neighbor (but not right), then recursively scan the right half
        if (midValue > nums[left]) return findPeakIndex(nums, mid + 1, end);
        
        // If current value is greater than right neighbor (but not left), then recursively scan the left half
        return findPeakIndex(nums, start, mid - 1);
    }
}
