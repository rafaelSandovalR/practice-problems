/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linked_list_cycle;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Rsand
 */
public class Solution {
    boolean hasCycle(ListNode head){
        
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) return true;
        }

        return false;
    }
}
