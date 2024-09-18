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
        int count = 0;
        int ptr1 = 0;
        int ptr2 = 0;
        
        while (count < k){
            int num1 = nums1[ptr1];
            int num2 = nums2[ptr2];
            
            if (num1 <= num2){
                
                for (int i = ptr2; i < nums2.length; i++){
                    var subList = new ArrayList<Integer>();
                    subList.add(num1);
                    subList.add(nums2[i]);
                    res.add(subList);
                    count++;
                    if (count == k) break;
                }
                ptr1++;
            } else {
                
                for (int i = ptr1; i < nums1.length; i++){
                    var subList = new ArrayList<Integer>();
                    subList.add(num2);
                    subList.add(nums1[i]);
                    res.add(subList);
                    count++;
                    if (count == k) break;
                }
                ptr2++;
            }
        }
        
        return res;
    }
}
