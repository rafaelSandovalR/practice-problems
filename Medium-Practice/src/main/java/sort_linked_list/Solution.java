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
        

        ListNode mid = getMiddle(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;
        
        left = sortList(left);
        right = sortList(right);
        
        return merge(left, right);        
    }
    
    private ListNode getMiddle(ListNode slow){
        ListNode fast = slow;
        
        while (fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    private ListNode merge(ListNode left, ListNode right){
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        
        while (left != null && right != null){
            if (left.val < right.val){
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }
        tail.next = (left != null) ? left : right;
        return dummyHead.next;
    }
}
