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
        
        // Dummy used to start list and return its next value as the head
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        
        while (list1 != null && list2 != null){
            
            // Compare next list values and assign smallest to tail's next
            if (list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            // Move to end of tail
            tail = tail.next;
        }
        
        // Append any existing values
        if (list1 != null){
            tail.next = list1;
        } else if (list2 != null){
            tail.next = list2;
        }
        
        return dummy.next;
    }
}
