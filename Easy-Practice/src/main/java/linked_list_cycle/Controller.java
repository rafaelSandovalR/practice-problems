/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linked_list_cycle;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        ListNode tail = new ListNode(4);
        ListNode beforeTail = new ListNode(0);
        ListNode afterHead = new ListNode(2);
        ListNode head = new ListNode(3);
        
        head.next = afterHead;
        afterHead.next = beforeTail;
        beforeTail.next = tail;
        tail.next = afterHead;
        
        boolean ans = sol.hasCycle(head);
    }
}
