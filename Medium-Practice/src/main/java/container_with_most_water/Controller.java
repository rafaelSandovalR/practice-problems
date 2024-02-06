/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package container_with_most_water;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution s = new Solution();
        
        int[] heights = new int[] {1,8,6,2,5,4,8,3,7};
        
        int result = s.maxArea(heights);
        
        System.out.println(result);
        
    }
}
