/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        List list = new ArrayList<>();
        Arrays.sort(nums);
        
        
        List<Integer> prev = new ArrayList<>();
        int rightPrev = nums.length - 1;
        
        for (int left = 0, mid = 1, right = nums.length-1; left < mid && mid < right; left++, mid = left + 1, right = rightPrev){
            
            int leftVal = nums[left];
            int midVal = nums[mid];
            int rightVal = nums[right];
            int sum = leftVal + midVal + rightVal;
            
            // Set right starting point using left and leftmost mid
            while (sum > 0 & right > mid){
                rightVal = nums[--right];
                sum = leftVal + midVal + rightVal;
            }
            rightPrev = right;
            
            // Determine all combinations with this left
            while (mid < right){
                leftVal = nums[left];
                midVal = nums[mid];
                rightVal = nums[right];
                sum = leftVal + midVal + rightVal;
                
                while (sum < 0 && mid < right) {
                    sum = nums[left] + nums[++mid] + nums[right];
                }

                while (sum > 0 && mid < right) {
                    sum = nums[left] + nums[mid] + nums[--right];
                }

                if (sum == 0 && mid < right) {
                    List<Integer> sub = new ArrayList<>();
                    System.out.println("[" + nums[left] + ", " + nums[mid] + "," + nums[right]);
                    sub.add(nums[left]);
                    sub.add(nums[mid]);
                    sub.add(nums[right]);

                    if (different(prev, sub)) {
                        list.add(sub);
                    }

                    prev = sub;
                    mid++;
                }
            }
        }

        
//        int sum = nums[left] + nums[mid] + nums[right];
//        if (sum == 0){
//            List<Integer> remaining = new ArrayList<>();
//            remaining.add(nums[left]);
//            remaining.add(nums[mid]);
//            remaining.add(nums[right]);
//            
//            if (different(prev, remaining))
//                list.add(remaining);
//        }

        

        
        return list;
    }
    
    private boolean different(List<Integer> prev, List<Integer> curr){
        if (prev.size() == 0) return true;
        for (int i = 0; i < 3; i++){
            if (prev.get(i) != curr.get(i)) return true;
        }
        
        return false;
    }
}
