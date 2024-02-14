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

        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int minLength = s.minSubArrayLen(target, nums);
        
    }

}
