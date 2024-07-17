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
        Solution2 s = new Solution2();
        
        int[] heights = new int[] {1,8,6,2,5,4,8,3,7};
        int[] heights2 = new int[] {1,2,4,3};
        
        int result = s.maxArea(heights2);
        
        System.out.println(result);
        
    }
}
