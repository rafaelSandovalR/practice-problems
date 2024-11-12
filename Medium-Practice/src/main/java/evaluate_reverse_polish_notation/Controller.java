/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluate_reverse_polish_notation;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        Solution sol = new Solution();
        int res = sol.evalRPN(tokens);
    }
}
