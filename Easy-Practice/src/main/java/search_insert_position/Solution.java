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
        
        int mid = start + (end - start) / 2;

        if (nums[mid] == target) return mid;
        
        if (start == end) return nums[mid] < target ? mid + 1 : mid;

        if (nums[mid] < target) return binarySearch(nums, mid + 1, end, target);
        else return binarySearch(nums, start, mid, target);
    }
}
