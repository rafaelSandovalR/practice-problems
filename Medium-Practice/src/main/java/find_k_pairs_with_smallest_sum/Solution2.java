/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package find_k_pairs_with_smallest_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k){
        
        // Priority queue to maintain pairs sorted by their sum
        final var q = new PriorityQueue<Pair>();
        
        // List to store the final result (k smallest pairs)
        final var res = new ArrayList<List<Integer>>();
        
        // Add the initial pair (first elements from both arrays)
        q.add(new Pair(0,0,nums1[0] + nums2[0]));
        
        // Loop k times to find k smallest pairs
        for (int i = 0; i < k; i++){
            
            // Retrieve and remove the smallest pair from the queue
            final Pair p = q.poll();
            
            // Add this pair to the result list
            res.add(Arrays.asList(nums1[p.i1], nums2[p.i2]));
            
            // Generate potential next pairs based on the current pair and add to the queue
            p.add(q, nums1, nums2);
            
        }
        
        return res;
    }
    
    // Record to represent a pair of indices and their corresponding sum
    record Pair(int i1, int i2, int sum) implements Comparable<Pair>{

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(sum, o.sum);
        }
        
        // Method to add potential next pairs to the queue
        void add(PriorityQueue<Pair> queue, int[] nums1, int[] nums2){
            
            if (i1 + 1 < nums1.length){
                queue.offer(new Pair(i1 + 1, i2, nums1[i1 + 1] + nums2[i2]));
            }
            
            if (i1 == 0 && i2 + 1 < nums2.length){
                queue.offer(new Pair(i1, i2 + 1, nums1[i1] + nums2[i2 + 1]));
            }
        }
    }
}
