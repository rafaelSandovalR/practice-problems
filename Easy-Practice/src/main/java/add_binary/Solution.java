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
        int carry = 0;
        
        while (aPtr >=0 || bPtr >=0){
            int sumDigit = carry;
            if (aPtr >= 0) sumDigit += a.charAt(aPtr--) - '0'; // Convert char to int
            if (bPtr >= 0) sumDigit += b.charAt(bPtr--) - '0';
            sum.append(sumDigit % 2);
            carry = sumDigit / 2;
            /*
                +-------+---+---+---+
                |   a   | 1 | 1 | 1 |
                |   b   | 0 | 1 | 1 |
                | carry | 0 | 0 | 1 |
                |-------------------|
                | TOTAL | 1 | 2 | 3 |
                +-------+---+---+---+
                | %2=Sum| 1 | 0 | 1 |
                | /2=Cry| 0 | 1 | 1 |
                +-------+---+---+---+
            
            */
        }
        
        if (carry == 1) sum.append(carry);
        
        return sum.reverse().toString();
    }
    
}
