/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package copy_list_with_random_pointer;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rsand
 */
public class Solution {
    public Node copyRandomList(Node head){
        
        Node original = head;
        Node dummy = new Node(0);
        Node prev = dummy;
        Map<Node, Node> corresponding = new HashMap<>();
        
        // Create a clone list with only matching val values
        while (original != null){
            // Create next node and link to previous
            Node copyTail = new Node(original.val);
            prev.next = copyTail;
            // Map it to the original node
            corresponding.put(original, copyTail);
            // Move prev to this node
            prev = prev.next;
            // Move original list to next;
            original = original.next;
        }

        // Add Random values
        while (head != null){
            corresponding.get(head).random = corresponding.get(head.random);
            head = head.next;
        }
        
        return dummy.next;
    }
}
