/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remove_element;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution s = new Solution();
        
        int[] nums = {0,1,2,2,3,3,0,4,2,6,2};
        
        s.removeElement(nums, 2);
        
        System.out.println("done");
    }
}
