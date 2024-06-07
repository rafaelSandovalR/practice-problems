/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package add_binary;

/**
 *
 * @author Rsand
 */
public class Solution {
    public String addBinary(String a, String b){
          
        int aPtr = a.length() - 1;
        int bPtr = b.length() - 1;
        StringBuilder sum = new StringBuilder();
        char carry = '0';
        
        while (aPtr >= 0 && bPtr >= 0){
            char[] result = add(a.charAt(aPtr--), b.charAt(bPtr--), carry);
            sum.append(result[0]);
            carry = result[1];
        }
        
        // Logic when a and b are not the same length
        if (aPtr >=0 || bPtr >= 0){
            int remPtr = aPtr >= 0 ? aPtr : bPtr;
            String z = aPtr >= 0 ? a : b;

            while (remPtr >= 0) {
                char[] result = add(z.charAt(remPtr--), carry, '0');
                sum.append(result[0]);
                carry = result[1];
            }
        }
        
        // If carry remains
        if (carry == '1'){
            sum.append(carry);
        }

        
        return sum.reverse().toString();
        
    }
    
    private char[] add(char a, char b, char carry){
        char[] result = {'0','0'}; // [sum, carry];
        
        // Logic for a + b calculation
        if (a == '1' && b == '1') {
            result[0] = '0';
            result[1] = '1';
        } else if ( a == '1' || b == '1'){
            result[0] = '1';
        }
        
        // Logic if carry is brought over from before
        if (carry == '1'){
            switch (result[0]) {
                case '0':
                    result[0] = '1';
                    break;
                case '1':
                    result[0] = '0';
                    result[1] = '1';
                    break;
            }
        }
        
        return result;
    }
}
