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
        
        int pivot = findPivot(nums, 0, n - 1);
        
        if (pivot == 0) return binarySearch(nums, target, 0, n-1);
        
        if (target >= nums[0] && target <= nums[pivot - 1]){
            return binarySearch(nums, target, 0, pivot - 1);
        }
        
        return binarySearch(nums, target,pivot, n - 1);

    }
    
    private int binarySearch(int[] nums, int target, int start, int end){

        if (end < start) return -1;
        
        int mid = (start + end) / 2;
        
        if (target == nums[mid]) return mid;
        
        if (target < nums[mid]) return binarySearch(nums, target, start, mid - 1);
        
        return binarySearch(nums, target, mid + 1, end);
    }
    
    private int findPivot(int[] nums, int start, int end){
        
        if (end < start) return 0;
        if (end == start) return start;
        
        int mid = (start + end) / 2;
        
        if (mid < end && nums[mid] > nums[mid + 1]) return mid + 1;
        
        if (mid > start && nums[mid] < nums[mid - 1]) return mid;
        
        if (nums[start] >= nums[mid]) return findPivot(nums, start, mid - 1);
        
        return findPivot(nums, mid + 1, end);
    }
}
