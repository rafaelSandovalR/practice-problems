/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.palindrome.linked.list;

/**
 *
 * @author Rs
 */
public class Solution {
    public boolean isPalindrome(ListNode head){
        ListNode slow=head, fast=head, prev, temp;
        
 //traverse linked list to find midpoint
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
 //set middle node's next to null
        prev = slow;
        slow = slow.next;
        prev.next = null;
 //invert second half of linked list
        while(slow.next != null){
            temp = prev;
            prev = slow;
            slow = slow.next;
            prev.next = temp;
        }
        
        slow.next = prev;
        
 //compare list from head & tail inward to determine if palindrome
        fast = head;
        while (slow != null){
            if (fast.val != slow.val){return false; }
            fast = fast.next;
            slow = slow.next;
        }
        
        return true;
    }
}
