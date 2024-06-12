/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package single_number_ii;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1,-3,2};
        Solution sol = new Solution();
        
        int single = sol.singleNumber(nums);
    }
}
