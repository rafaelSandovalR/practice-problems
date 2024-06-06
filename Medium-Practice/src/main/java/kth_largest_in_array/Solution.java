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
        
        // if (nums.length == 1) return nums[0];
        int[] minHeap = new int[k];
        
        heapify(nums, minHeap);
        
        for (int i = k; i < nums.length; i++){
            if (nums[i] > minHeap[0]){
                remove(minHeap);
                insert(minHeap, nums[i]);
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
    
    private void remove(int[] minHeap){
        int heapSize = minHeap.length;
        int idx = 0;
        minHeap[idx] = minHeap[heapSize - 1];
        int smallestChildIdx = 0;
        
        while (smallestChildIdx >= 0){
            smallestChildIdx = getSmallestChildIdx(minHeap, idx);
            if (smallestChildIdx < 0) break;
            swap(minHeap, idx, smallestChildIdx);
            idx = smallestChildIdx;
        }
    }
    
    private int getSmallestChildIdx(int[] minHeap, int idx){
        int size = minHeap.length - 1;
        int leftChild = idx * 2 + 1;
        int rightChild = idx * 2 + 2;

        
        if (leftChild > size && rightChild > size){
            return -1;
        }
        
        if (rightChild > size) return leftChild;
        else if (leftChild > size) return rightChild;
        else if (minHeap[leftChild] > minHeap[rightChild]) return rightChild;
        else return leftChild;
    }

    private void heapify(int[] nums, int[] minHeap) {
        for (int i = 0; i < minHeap.length; i++){
            minHeap[i] = nums[i];
        }
        
        if (minHeap.length == 1) return;
        
        for (int parent = ((minHeap.length - 2) / 2); parent >= 0; parent--){

            int smallestChild = getSmallestChildIdx(minHeap, parent);
            
            if (minHeap[parent] > minHeap[smallestChild]){
                swap(minHeap, parent, smallestChild);
                
                int siftParent = smallestChild;
                smallestChild = getSmallestChildIdx(minHeap, siftParent);
                
                while (smallestChild != -1){
                    if (minHeap[siftParent] > minHeap[smallestChild]){
                        swap(minHeap, siftParent, smallestChild);
                    }
                    siftParent = smallestChild;
                    smallestChild = getSmallestChildIdx(minHeap, siftParent);
                }
            }
        }
    }
    
    private void swap(int[] minHeap, int x, int y){
        int temp = minHeap[x];
        minHeap[x] = minHeap[y];
        minHeap[y] = temp;
    }
}
