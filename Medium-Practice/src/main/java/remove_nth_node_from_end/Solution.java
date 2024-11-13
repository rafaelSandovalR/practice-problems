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
        
        while (temp != null){
            
            if (deque.size() == n + 1){
                deque.pollFirst();
            }
            
            deque.add(temp);
            
            temp = temp.next;
        }
        
        ListNode pre = deque.poll();
        deque.poll();
        ListNode post = deque.poll();
        
        pre.next = post;
        
        return head;
    }
}
