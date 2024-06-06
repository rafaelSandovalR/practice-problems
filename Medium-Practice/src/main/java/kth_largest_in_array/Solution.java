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
        
        // Build initial min heap
        int[] minHeap = new int[k];
        for (int i = 0; i < k; i++){
            minHeap[i] = nums[i];
        }
        
        heapify(minHeap);
        
        /**
         * Go through the remainder of the values in input
         * and add them to the min heap (replace top) and
         * ensure heap is maintained 
         */
        
        for (int i = k; i < nums.length; i++){
            if (nums[i] > minHeap[0]){
                minHeap[0] = nums[i];
                siftDown(minHeap, 0, minHeap.length);
            }
        }
        
        return minHeap[0]; // Return the top of min heap
    }
      
    private void heapify(int[] heap) {
        /**
         * Starting with the first non-leaf node:
         * 1) Swap node with its smallest child
         * 2) If that smallest child is a non-leaf node: swap with its smallest child
         * 3) Move towards first node
         */
        int len = heap.length;
        for (int parent = (len - 2) / 2; parent >= 0; parent--){
            siftDown(heap, parent, len);
        }
    }
    
    private void siftDown(int[] heap, int parent, int heapSize){
        int smallest = parent;
        int leftChild = 2 * parent + 1;
        int rightChild = 2 * parent + 2;
        
        if (leftChild < heapSize && heap[leftChild] < heap[smallest]){
            smallest = leftChild;
        }
        if (rightChild < heapSize && heap[rightChild] < heap[smallest]){
            smallest = rightChild;
        }
        
        if (smallest != parent){
            swap(heap, parent, smallest);
            siftDown(heap, smallest, heapSize);
        }
    }
    
    
    private void swap(int[] heap, int x, int y){
        int temp = heap[x];
        heap[x] = heap[y];
        heap[y] = temp;
    }
}
