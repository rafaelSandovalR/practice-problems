/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package find_k_pairs_with_smallest_sum;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k){
        var res = new ArrayList<List<Integer>>();
        
        // Handle edge cases

        int n1 = nums1.length;
        int n2 = nums2.length;
        
        // Keeps trakc of the current index in 'nums2' for each element in 'nums1'
        int[] arr = new int[n1];
        arr[0] = 1; // Mark the first element in 'nums1' as used
        
        // Add the first of both lists
        var first = new ArrayList<Integer>();
        first.add(nums1[0]);
        first.add(nums2[0]);
        res.add(first);
        
        while (res.size() < k){
            
            int i = 0;
            int min = Integer.MAX_VALUE;
            int index = -1;
            
            // Find the next smallest pair among the pairs formed by elements from 'nums1'
            // and their corresponding  next elements from 'nums2'
            while (i < n1 && arr[i] != 0){
                if (arr[i] < n2 && nums1[i] + nums2[arr[i]] < min){
                    index = i;
                    min = nums1[i] + nums2[arr[i]];
                }
                i++;
            }
            
            // Check if there's any unused element in 'nums1' that can form a smaller pair
            if (i < n1){
                if (arr[i] < n2 && nums1[i] + nums2[arr[i]] < min){
                    index = i;
                    min = nums1[i] + nums2[arr[i]];
                }
                i++;
            }
            
            // Add the found smallest pair to the result
            var newPair = new ArrayList<Integer>();
            newPair.add(nums1[index]);
            newPair.add(nums2[arr[index]]);
            res.add(newPair);
            
            // Move to the next element in 'nums2' for the element at 'index' in 'nums1'
            arr[index]++;
        }
        
        return res;
    }
}
