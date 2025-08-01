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

            int rem = num % romanVal[i];
            if (i % 2 != 0 && (num / romanVal[i-1] == 9 || num / romanVal[i-1] == 4)){
                if (num / romanVal[i-1] == 9){
                    ans.append(romanChar[i - 1]);
                    ans.append(romanChar[i + 1]);                    
                }
                if (num / romanVal[i-1] == 4){
                    ans.append(romanChar[i - 1]);
                    ans.append(romanChar[i]);
                }

                rem = num % romanVal[i-1];
            } else{
                for (int j = 0; j < num / romanVal[i]; j++) {
                    ans.append(romanChar[i]);
                }
            } 
            num = rem;

        }
        
        return ans.toString();
    }
}
