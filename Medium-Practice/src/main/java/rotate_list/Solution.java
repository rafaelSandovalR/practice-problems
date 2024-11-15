/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotate_list;

/**
 *
 * @author Rsand
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k){
        if (head == null) return null; // Edge case: empty input
        
        // Two pointers: 'first' will find the kth node, 'second' will find the new tail
        ListNode first = head;
        ListNode second = head;
        
        for (int i = 0; i < k; i++){
            // Iterate through linked list. If end is reached, wrap back around
            first = first.next == null ? head : first.next;
        }
        
        // If kth node is head, then no rotation is needed
        if (first == head) return head;
        
        // Get 'first' to last node, 'second' will lag k steps behind
        while (first.next != null){
            first = first.next;
            second = second.next;
        }
        
        // Here is where the new split will happen
        ListNode rotatedHead = second.next; // New head is node after 'second'
        second.next = null; // 'second' is new tail
        first.next = head; // connect previous tail to previous head
        
        return rotatedHead;  
    }
}
