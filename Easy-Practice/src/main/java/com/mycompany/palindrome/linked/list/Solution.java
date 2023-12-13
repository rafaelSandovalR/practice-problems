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
        ListNode slow=head, fast=head, prev, temp = null;
 //traverse linked list to find midpoint
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
 //set middle node's next to null
        prev = slow;
        slow = slow.next;
        prev.next = null;
        
        return false;
    }
}
