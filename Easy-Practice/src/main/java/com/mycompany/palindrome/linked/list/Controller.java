/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.palindrome.linked.list;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        ListNode head1 = setNodes(1,2,3,4);
        
        System.out.println(head1.val);
        System.out.println(head1.next.val);
        System.out.println(head1.next.next.val);
        System.out.println(head1.next.next.next.val);
        
    }
    
    public static ListNode setNodes(int... numbers){
        System.out.println("Length: " + numbers.length);
        int count = 1;
        ListNode head = new ListNode(numbers[0]);
        ListNode current = new ListNode();
        if(numbers.length != 1){head.next = current;} 
        
        for(int number : numbers){
            if(count != 1) {
                current.val = number; 
                if(count < numbers.length){
                    ListNode nextNode = new ListNode();
                    current.next = nextNode;
                    current = nextNode;
                }
            }
            count++;
        }
        
        return head;
    }
}
