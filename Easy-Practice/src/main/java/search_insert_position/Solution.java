/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package search_insert_position;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int searchInsert(int[] nums, int target){
        return binarySearch(nums, 0, nums.length - 1, target);
    }
    
    private int binarySearch(int[] nums, int start, int end, int target){
        
        int mid = start + (end - start) / 2; // Find middle using Integer overflow safeguard

        if (nums[mid] == target) return mid; // Return index if target is found
        
        // If target is not found and target is larger than the last number checked, 
        // the target would be placed one index ahead, if it is smaller then the 
        // target would be placed at current index
        if (start == end) return nums[mid] < target ? mid + 1 : mid;

        // Search right half
        if (nums[mid] < target) return binarySearch(nums, mid + 1, end, target);
        else return binarySearch(nums, start, mid, target); // Search left half
    }
}
