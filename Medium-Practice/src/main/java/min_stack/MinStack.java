/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package min_stack;

/**
 *
 * @author Rsand
 */
public class MinStack {
    
    int[] elementStack;
    int[] minStack;
    int elementTop, minTop; // Represent next empty spot on top of stacks
    
    public MinStack() {
        elementStack = new int[30000];
        minStack = new int[30000];
        elementTop = 0;
        minTop = 0;
        
    }

    public void push(int val) {
        elementStack[elementTop++] = val;
        
        // If minStack is empty    OR   (minStack is not empty AND val is a new/equal min)
        if (0 == minTop || (0 < minTop && val <= minStack[minTop - 1])){
            minStack[minTop++] = val;
        }
    }

    public void pop() {
        if(elementStack[--elementTop] == minStack[minTop - 1]){
            --minTop;
        }
    }

    public int top() {
        return elementStack[elementTop - 1];
    }

    public int getMin() {
        return minStack[minTop - 1];
    }
}
