/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merge_two_sorted_lists;

/**
 *
 * @author Rsand
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        
        // Check if both lists are empty
        if (list1 == null && list2 == null) return null;
        
        ListNode head = null, ptr = null, smallest;
        
            while (list1 != null && list2 != null){
           
                // Determine which node is smallest and move corresponding list forward
                if (list1.val <= list2.val){
                    smallest = list1;
                    list1 = list1.next;

                } else {
                    smallest = list2;
                    list2 = list2.next;
                }

                // Initialize pointer and head
                if (ptr == null) {
                    ptr = smallest;
                    head = smallest;
                } else {
                    // Point to next smallest node and move to that node
                    ptr.next = smallest;
                    ptr = ptr.next;
                }           
            }
            
            // Check for instances when one list has not reached the end yet
            if (list1 != null && ptr != null) ptr.next = list1;
            if (list2 != null && ptr != null) ptr.next = list2;
            if (list1 != null && ptr == null) head = list1;
            if (list2 != null && ptr == null) head = list2;
        
        return head;
    }
}
