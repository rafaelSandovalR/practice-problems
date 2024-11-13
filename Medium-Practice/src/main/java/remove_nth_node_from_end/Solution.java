/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remove_nth_node_from_end;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Rsand
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n){

        ListNode dummy = new ListNode(); // Dummy node simplifies edge cases
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        
        // Move 'first' n+1 steps ahead
        for (int i = 1; i <= n + 1; i++){
            first = first.next;
        }
        
        // Move both pointers until 'first' reaches the end
        while (first != null){
            first = first.next;
            second = second.next;
        }
        
        // Remove the target node
        second.next = second.next.next;
        
        return dummy.next;
    }
}
