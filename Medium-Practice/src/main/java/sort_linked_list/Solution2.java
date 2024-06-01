/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort_linked_list;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    public ListNode sortList(ListNode head){
        return sortList(head, null);
    }
    
    private ListNode sortList(ListNode start, ListNode end){
       
        // Base cases: Empty list, single node, or reaching the end
        if (start == null || start.next == null || start == end) return start;
        
        ListNode left = start; // Start of the sorted portion
        ListNode right = start; // End of the sorted portion
        ListNode curr = start.next; // pointer to iterate through the unsorted portion
        boolean sorted = true; // Flag to check if the sublist is already sorted
        
        // Iterate through the unsorted portion until we reach the end or 'end' pointer
        while (curr != null && curr != end){
            ListNode temp = curr.next; // Store the next node for later reconnection
            
            // Case 1: Current node is smaller than the start of the sorted portion
            if (curr.val < start.val){
                curr.next = left;
                left = curr;
                right.next = temp;
                sorted = false;
            } 
            // Case 2: Current node belongs within the sorted portion
            else {
                if (curr.val < right.val) sorted = false; // Mark the list as unsorted if not in order
                right = curr; // Move right to the current node
            }
            curr = temp; // Move to the next unsorted node
        }
        
        if (sorted) return left; // If the sublist was already sorted, return it directly
        
        // Recursively sort the left and right sublists (divided by the original 'start' node)
        left = sortList(left, start);
        start.next = sortList(start.next, end);
        
        // Return the head of the sorted sublist
        return left;
    }
}
