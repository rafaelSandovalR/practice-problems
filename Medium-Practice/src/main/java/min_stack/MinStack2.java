/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package min_stack;

/**
 *
 * @author Rsand
 */
public class MinStack2 {
    
    Node head;
    
    public MinStack2(){
        head = null;
    }
    
    public void push(int val){
        if (head == null){
            head = new Node(val, val, null);
        } else {
            head = new Node(val, Math.min(head.min,val), head);
        }
    }
    
    public void pop(){
        if (head != null) head = head.next;
    }
    
    public int top(){
        if (head != null) return head.val;
        
        return -1;
    }
    
    public int getMin(){
        if (head != null) return head.min;
        
        return -1;
    }
    
    
    // Subclass to create linked list
    class Node{
        int val;
        int min;
        Node next;
        
        public Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}
