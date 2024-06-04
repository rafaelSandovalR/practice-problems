/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kth_largest_in_array;

import java.util.Arrays;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int findKthLargest(int[] nums, int k){
        
        int[] minHeap = new int[k];
        
        for (int i = 0; i < k; i++) {
            minHeap[i] = Integer.MIN_VALUE;
        }
        
        
        for (int i = 0; i < k; i++){
            insert(nums, nums[i]);
        }
        
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < minHeap[0]){
                
            }
            
            
            
        }
        
        return minHeap[0];
    }
    
    private void insert(int[] minHeap, int val){
        int idx = minHeap.length - 1;
        minHeap[idx] = val;
        int parentIdx = (idx - 1) / 2;

        while (idx >= 0 && val < minHeap[parentIdx]){
            int temp = minHeap[parentIdx];
            minHeap[parentIdx] = val;
            minHeap[idx] = temp;
            
            idx = parentIdx;
            parentIdx = (idx - 1) / 2;
        }
    }
}
