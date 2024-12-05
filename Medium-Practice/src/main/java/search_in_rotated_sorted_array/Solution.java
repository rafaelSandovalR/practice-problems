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
        
        int k = findK(nums, 0, nums.length-1);
        
        return binarySearch(nums, target, k, k-1);
    }
    
    private int binarySearch(int[] nums, int target, int start, int end){
        int n = nums.length;
        start = (((start % n) + n) % n);
        end = (((end % n) + n) % n);
        
        int mid = start > end ? ((start + end) % nums.length) / 2 : (start + end) / 2;
        if (target == nums[mid]) return mid;
        if (start == end || start == mid) return -1;
        if (target < nums[mid]) return binarySearch(nums, target, start, mid - 1);
        return binarySearch(nums, target, mid + 1, end);
    }
    
    private int findK(int[] nums, int start, int end){
        
        if (nums[start] <= nums[end]) return nums[start] < nums[nums.length-1] ? start : start + 1;
        
        int mid = (start + end) / 2;
        
        if (nums[mid] > nums[end]) return findK(nums, mid + 1, end);
        return findK(nums, start, mid - 1);
    }
}
