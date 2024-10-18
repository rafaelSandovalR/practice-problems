/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        List list = new ArrayList<>();
        Arrays.sort(nums);
        
        if (nums[0] == 0 && nums[1] == 0 && nums[nums.length-1] == 0){
            List<Integer> sub = new ArrayList<>();
            sub.add(0);
            sub.add(0);
            sub.add(0);
            list.add(sub);
            return list;
        }
        
        // Map to store existing combinations
        var existingFirst = new HashMap<Integer, Set>();
        
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


                    if (!existingFirst.containsKey(nums[left])){
                        var comboMids = new HashSet<Integer>();
                        comboMids.add(nums[mid]);
                        existingFirst.put(nums[left], comboMids);
                        list.add(sub);
                    } else if (!existingFirst.get(nums[left]).contains(nums[mid])){
                        existingFirst.get(nums[left]).add(nums[mid]);
                        list.add(sub);
                    }

                    prev = sub;
                    mid++;
                }
            }
        }

        return list;
    }
    
}
