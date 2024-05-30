/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort_linked_list;

/**
 *
 * @author Rsand
 */
public class Solution {
    public ListNode sortList(ListNode head){
        if (head == null || head.next == null) return head;
        
        ListNode current = head;
        
        while(current != null){
            ListNode minNode = current; // Assume current is min initially 
            ListNode search = current.next; // Pointer to search for smallest node
            
            while (search != null){
                if (search.val < minNode.val){
                    minNode = search; // Update min
                }
                search = search.next;
            }
            
            // Swap values in current and minNode
            int temp = current.val;
            current.val = minNode.val;
            minNode.val = temp;
            
            current = current.next; // Move to the next unsorted node
        }
        
        
        return head;
    }
}
