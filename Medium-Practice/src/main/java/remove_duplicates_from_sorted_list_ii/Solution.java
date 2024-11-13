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
        ListNode dummy = new ListNode(101, head);
        ListNode curr = dummy;
        ListNode prev = dummy;
        
        while (curr != null && curr.next != null){
            if (curr.val != curr.next.val){
                prev = curr;

            } else {
                while (curr.next != null && curr.next.val == curr.val){
                    curr = curr.next;
                }
                prev.next = curr.next;
            }
            
            curr = curr.next;
        }
        
        return dummy.next;
    }
}
