/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reversed_linked_list_ii;

/**
 *
 * @author Rsand
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right){

        ListNode beforeReversed = head, reversedEnd = null, curr = null, prev = null, next = null;
        
        while (beforeReversed.next.val != left){
            beforeReversed = beforeReversed.next;
        }
        
        reversedEnd = beforeReversed.next;
        prev = reversedEnd;
        curr = reversedEnd.next;
        next = curr.next;
        
        while (prev.val != right){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        
        beforeReversed.next = prev;
        reversedEnd.next = curr;
        
        return head;
        
    }
}
