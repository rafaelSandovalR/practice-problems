/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zigzag_conversion;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution s = new Solution();
        
        String input = "ABCDE";
        
        String output = s.convert(input, 4);
        
        System.out.println(output);
    }
}
