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
        
        // before:  the node in position 'left' - 1
        // end:     the node at position 'left' (end of segement after reversal)
        ListNode before = head, end = null;
        
        // Vars for reversal while traversing
        ListNode prev = null, curr = head, next = head.next;
        int pos = 1; // Counter to keep track of current position
        
        // Set 'curr' to the node in position 'left' to begin reversal
        while (pos < left){
            prev = curr;
            curr = curr.next;
            next = next.next;
            ++pos;
        }
        
        before = prev; // Save the node before the nodes that will be reversed
        end = curr; // Save the first node (at position 'left') which will become the end of the reversed segment
        
        // Reverse segment from position 'left' to position 'right'
        while (pos <= right){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next == null ? null : next.next; // Avoids calling .next on null
            ++pos;
        }
       
        if (before != null){ // If before was initiated, it means 'left' > 1
            before.next = prev;
        } else {
            head = prev; // If 'left' == 1, 'head' will be the last node reversed: 'prev'
        }

        end.next = curr; // Attach the end of the reversed segment to the rest of the nodes after
        
        return head;
        
    }
}
