/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spiral_matrix;

import java.util.List;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution s = new Solution();
        
        int[][] matrix =    {{1,2,3,4}
                            ,{5,6,7,8}
                            ,{9,10,11,12}};
        
        List<Integer> ans = s.spiralOrder(matrix);
        
        int test = 0;
    }
}
