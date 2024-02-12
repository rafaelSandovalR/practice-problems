/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package two_sum_ii_sorted;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target){
        int[] ans = new int[2];
        int sum;
        
        int left = 0;
        int right = numbers.length-1;
        
        while(left < right){
            
            sum = numbers[left] + numbers[right];
            if (sum > target){ right--;}
            if (sum < target){ left++;}
            if (sum == target) {
                ans[0] = left+1;
                ans[1] = right+1;
                break;
            }
        }
        
        return ans;
    }
}
