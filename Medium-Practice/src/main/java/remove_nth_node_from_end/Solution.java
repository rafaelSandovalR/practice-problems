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
        Deque<ListNode> deque = new ArrayDeque<>();
        ListNode temp = head;
        ListNode prev = null;
        
        while (temp != null){
            
            if (deque.size() == n){
                prev = deque.pollFirst();
            }
            
            deque.add(temp);
            
            temp = temp.next;
        }

        deque.poll();
        ListNode post = deque.poll();
        
        if (prev == null) return null;
        
        prev.next = post;
        
        return head;
    }
}
