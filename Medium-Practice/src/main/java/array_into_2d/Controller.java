/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array_into_2d;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution s = new Solution();
        
        int[] arr = {9,10,9,1,5,24,4,1};
        
        s.findMatrix(arr);
        
        for(int i : arr){
            System.out.print(i + ", ");
        }
    }
}
