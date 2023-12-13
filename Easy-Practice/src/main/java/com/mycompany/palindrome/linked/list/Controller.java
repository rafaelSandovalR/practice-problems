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
        ListNode head1 = setNodes(1,3,2,3,1,3,2,3,1);
        displayResults(head1);
        
        ListNode head2 = setNodes(1,2,3);
        displayResults(head2);
        
        ListNode head3 = setNodes(9,8);
        displayResults(head3);
        
        ListNode head4 = setNodes(9);
        displayResults(head4);
    }
    
    public static ListNode setNodes(int... numbers){
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
    
    public static void displayResults(ListNode head){
        ListNode current = head;
        System.out.print("Linked List: {");
        while(current!=null){
            System.out.print(current.val);
            if(current.next != null){System.out.print(", "); }
            else{System.out.println("}"); }
            current = current.next;
        }
        
        Solution s = new Solution();
        System.out.printf("Is Palindrome?: %s \n\n", s.isPalindrome(head)); 
    }
}
