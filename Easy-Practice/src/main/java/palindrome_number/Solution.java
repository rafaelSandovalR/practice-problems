/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palindrome_number;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean isPalindrome(int x){
        if (x < 0) return false; // Base case: Negative numbers cannot be palindromes

        int sum = 0;    // Stores the reversed number
        int n = x;      // Working copy of input
        
        while (n != 0) {
            int r = (int) n % 10;   // Extract the rightmost digit
            sum = sum * 10 + r;     // Append the extracted digit to reversed number
            n /= 10;                // Remove the rightmost digit from the working copy
        }

        return (sum == x);
    }
}
