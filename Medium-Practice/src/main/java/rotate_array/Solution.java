/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotate_array;

/**
 *
 * @author Rsand
 */
public class Solution {
    public void rotate(int[] nums, int k){
        int n = nums.length;
        
        if (k % n == 0) return;
        
        int[] rotated = new int[n];
        
        for (int i = 0, place = k % n; i < n; i++, place++){
            place %= n;
            rotated[place] = nums[i];
        }
        
        for (int i = 0; i < n; i++){
            nums[i] = rotated[i];
        }
        
    }
    /**
     *  IN PLACE ROTATION: REVERSAL ALGORITHM
     */
    public void rotate2(int[] nums, int k){
        int n = nums.length;
        k %= n;
        
        reverse(nums, 0, n - 1); // Reverse the whole array
        reverse(nums, 0, k - 1); // Reverse the first k elements
        reverse(nums, k, n - 1); // Reverse the rest
    }
    
    private void reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
