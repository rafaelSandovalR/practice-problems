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
        if (head == null || head.next == null) return head; // Base case: 0 or 1 node
        
        // Split the list into two halves
        ListNode mid = getMiddle(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null; // Disconnect the two halves
        
        // Recursively sort both halves
        left = sortList(left);
        right = sortList(right);
        
        return merge(left, right); // Merge the sorted halves and return
    }
    
    private ListNode getMiddle(ListNode slow){
        // Find the middle node using slow and fast pointers
        ListNode fast = slow;
        while (fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    private ListNode merge(ListNode left, ListNode right){
        ListNode dummyHead = new ListNode(0); // Dummy node to lead into new merged list
        ListNode tail = dummyHead; // Pointer to track current end of merged list
        
        
        while (left != null && right != null){
            // Compare the values and append the smaller one to the merged list
            if (left.val < right.val){
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next; // Move the tail to the newly appended node
        }
        tail.next = (left != null) ? left : right; // Append the remaining nodes
        return dummyHead.next; // Return the head of the merged list (skipping the dummy node)
    }
}
