/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kth_largest_in_array;

/**
 *
 * @author Rsand
 * \
 * NOT A WORKING SOLUTION ON LEETCODE
 */
public class Solution_QuickSelect {
    public int findKthLargest(int[] nums, int k){
        k = nums.length - k;
        int left = 0, right = nums.length - 1;
        
        while (left <= right){
            int pivotIndex = partition(nums, left, right);
            
            if (pivotIndex == k) return nums[pivotIndex];
            else if (pivotIndex < k) left = pivotIndex + 1;
            else right = pivotIndex - 1;
        }
        return -1; // Should not reach here
    }
    
    private int partition(int[] nums, int left, int right){
        int pivot = nums[right];
        int storeIndex = left;
        
        for (int i = left; i < right; i++){
            if (nums[i] <= pivot){
                swap(nums, storeIndex, i);
                storeIndex++;
            }
        }
        swap(nums, storeIndex, right);
        return storeIndex;
    }
    
    private void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
