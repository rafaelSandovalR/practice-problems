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
        if (head.next == null) return head;

        ListNode before = head, end = null, prev = null, curr = head, next = head.next;
        int pos = 1;
        
        while (pos < left){
            prev = curr;
            curr = curr.next;
            next = next.next;
            ++pos;
        }
        
        before = prev;
        end = curr;
        
        while (pos <= right){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next == null ? null : next.next;
            ++pos;
        }
       

        before.next = prev;
        end.next = curr;
        
        return head;
        
    }
}
