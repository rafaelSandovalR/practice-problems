/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package min_stack;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        MinStack minstack = new MinStack();
        int min = Integer.MAX_VALUE;
        
        minstack.push(2);
        minstack.push(0);
        minstack.push(3);
        minstack.push(0);
        
        min = minstack.getMin();
        minstack.pop();
        min = minstack.getMin();
        minstack.pop();
        min = minstack.getMin();
        minstack.pop();
        min = minstack.getMin();
    }
}
