/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package search_in_rotated_sorted_array;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int search(int[] nums, int target){
        int n = nums.length;
        
        // Find the pivot index (index of the smallest element)
        int pivot = findPivot(nums, 0, n - 1);
        
        //If array has not been rotated, perform regular binary search
        if (pivot == 0) return binarySearch(nums, target, 0, n-1);
        
        
        // If target is within the left sorted portion
        if (target >= nums[0] && target <= nums[pivot - 1]){
            return binarySearch(nums, target, 0, pivot - 1);
        }
        // Otherwise, the target must be in the right sorted portion
        return binarySearch(nums, target,pivot, n - 1);

    }
    
    
    
    private int binarySearch(int[] nums, int target, int start, int end){
        // Base case: range is invalid
        if (end < start) return -1;
        
        // Calculate the middle index preventing integer overflow
        // ORIGINAL: int mid = (start + end) / 2;
        int mid = start + (end - start) / 2;
        
        if (target == nums[mid]) return mid;
        
        if (target < nums[mid]) return binarySearch(nums, target, start, mid - 1);
        
        return binarySearch(nums, target, mid + 1, end);
    }
    
    private int findPivot(int[] nums, int start, int end){
        
        // Base cases:
        if (end < start) return 0;      // No rotation or empty
        if (end == start) return start; // Single element
        
        int mid = start + (end - start) / 2;
        
        // Base cases: pivot found
        if (mid < end && nums[mid] > nums[mid + 1]) return mid + 1;
        if (mid > start && nums[mid] < nums[mid - 1]) return mid;
        
        
        if (nums[start] >= nums[mid]) return findPivot(nums, start, mid - 1);   // Find pivot in the left half
        return findPivot(nums, mid + 1, end);   // Find pivot in the right half
    }
}
