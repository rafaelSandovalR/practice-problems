/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort_linked_list;

/**
 *
 * @author Rsand
 */
public class Solution3 {
    public ListNode sortList(ListNode head){
        
        if(head == null) return head;
        
        ListNode newHead = head;
        ListNode newTail = head;
        ListNode current = head.next;

        while (current != null){

            if (current.val < newHead.val){
                ListNode temp = newHead;
                newHead = current;
                head = current.next; // Save next in line
                current.next = temp;
            } else if (current.val < newTail.val){
                ListNode prev = getPrev(current.val, newHead);
                ListNode after = prev.next;
                prev.next = current;
                head = current.next;
                current.next = after;
                if (after.next == current) after.next = null;
            } else {
                newTail.next = current;
                head = current.next;
                newTail = current; 
            }
            
            current = head;
            
        }
        
        newTail.next = null;
        
        return newHead;
    }
    
    private ListNode getPrev(int value, ListNode head){
        
        while (head.next != null && head.next.val < value){
            head = head.next;
        }
        
        return head;
    }
}
