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
            var subList = new ArrayList<Integer>();
            
            int leftA = nums1[left1st], leftB = nums2[left2nd];
            int rightA = nums2[right1st], rightB = nums1[right2nd];
            
            int leftSum = leftA + leftB;
            int rightSum = rightA + rightB;
            
            if (leftSum <= rightSum){
                subList.add(leftA);
                subList.add(leftB);
                
                left2nd++;
                
                if (left2nd == n2){
                    left1st++;
                    left2nd = 0;
                }
            } else {
                subList.add(rightB);
                subList.add(rightA);

                right2nd++;
                
                if (right2nd == n1){
                    right1st++;
                    right2nd = 0;
                }
            }
            
            res.add(subList);
            count++;
        }
        
        return res;
    }
}
