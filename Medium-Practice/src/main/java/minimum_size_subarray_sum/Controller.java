/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimum_size_subarray_sum;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {10,5,13,4,8,4,5,11,14,9,16,10,20,8};
        int target = 80;

        int minLength = s.minSubArrayLen(target, nums);
        
    }

}
