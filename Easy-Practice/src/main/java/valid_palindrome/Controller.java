/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valid_palindrome;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        String s = "Marge, let's \\\"[went].\\\" I await {news} telegram.";
        
        Solution sol = new Solution();
        sol.isPalindrome(s);
    }
}
