/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integer_to_roman;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    String[] chars = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int[] vals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public String intToRoman(int num){
        
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < vals.length; i++){
            while (num >= vals[i]){
                ans.append(chars[i]);
                num-=vals[i];
            }
        }
        
        return ans.toString();
    }

}
