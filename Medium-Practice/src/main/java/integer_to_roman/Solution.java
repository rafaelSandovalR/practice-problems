/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integer_to_roman;

/**
 *
 * @author Rsand
 */
public class Solution {
    int[] romanVal = {1,5,10,50,100,500,1000};
    char[] romanChar = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};


    public String intToRoman(int num){
        
        StringBuilder ans = new StringBuilder();
        
        for (int i = 6; i >= 0; i--){
                       
            int pre = romanVal[Math.max(0, i-1)], preExtract = num / pre;
            int curr = romanVal[i];
            int divisor = curr;
            
            if (i % 2 != 0 && (preExtract == 4 || preExtract == 9)){
                ans.append(romanChar[i-1]);
                switch(preExtract){
                    case 4 -> ans.append(romanChar[i]);
                    case 9 -> ans.append(romanChar[i+1]);
                }
                divisor = pre;
            } else{
                for (int j = 0; j < num / curr; j++) {
                    ans.append(romanChar[i]);
                }
            }
            
            num %= divisor;
        }
        
        return ans.toString();
    }
}
