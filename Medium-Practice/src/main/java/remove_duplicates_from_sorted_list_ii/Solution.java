/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remove_duplicates_from_sorted_list_ii;

/**
 *
 * @author Rsand
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head){
        // Create a dummy node to simplify edge case handling
        ListNode dummy = new ListNode(-101, head);
        
        
        // Initialize two pointers: curr to traverse the list and prev to track the previous non-duplicate node
        ListNode curr = dummy;
        ListNode prev = dummy;
        
        
        while (curr != null && curr.next != null){
            
            // If the current node's value is different from the next node's, use curr as the latest non-duplicate node (prev)
            if (curr.val != curr.next.val){
                prev = curr;

            } else {
                // If the values match, find the end of the duplicate sequence
                while (curr.next != null && curr.next.val == curr.val){
                    curr = curr.next;
                }
                
                // Skip all the duplicates by connecting the last non-duplicate node to the node after the duplicate sequence
                prev.next = curr.next;
            }
            
            // Move curr to the next node
            curr = curr.next;
        }
        
        // Return the head of the cleaned-up linked list
        return dummy.next;
    }
}
