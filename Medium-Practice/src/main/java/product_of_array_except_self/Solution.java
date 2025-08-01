/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product_of_array_except_self;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        
        // Get product of everything before current index
        int pre = 1;
        for (int i = 0; i < n; i++){
            ans[i] = pre;
            pre *= nums[i];
        }
        
        // Get product of everything after current index AND previous product
        int post = 1;
        for (int i = n-1; i >= 0; i--){
            ans[i] *= post;
            post *= nums[i];
        }
         
        return ans;
    }
}
