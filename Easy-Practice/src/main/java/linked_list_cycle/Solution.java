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
        Set<ListNode> nodes = new HashSet<>();
        
        while (head.next != null){
            
            if (!nodes.add(head)) return true;
            head = head.next;
        }
        
        return false;
    }
}
