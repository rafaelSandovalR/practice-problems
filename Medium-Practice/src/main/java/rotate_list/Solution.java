/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotate_list;

/**
 *
 * @author Rsand
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k){
        if (head == null) return null;
        ListNode first = head;
        ListNode second = head;
        
        for (int i = 0; i < k; i++){
            first = first.next == null ? head : first.next;
        }
        
        if (first == head) return head;
        
        while (first.next != null){
            first = first.next;
            second = second.next;
        }
        
        ListNode rotatedHead = second.next;
        second.next = null;
        first.next = head;
        
        return rotatedHead;  
    }
}
