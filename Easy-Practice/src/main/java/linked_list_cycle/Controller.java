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
        
        long startTime = System.nanoTime();
        boolean ans = sol.hasCycle(head);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        
        System.out.println("Execution Time: " + elapsedTime + " Nanoseconds");
        
        /*
            3-17-24     17300       0.493s
            LeetCode:   4 ms        44.48 MB
        */
    }
}
