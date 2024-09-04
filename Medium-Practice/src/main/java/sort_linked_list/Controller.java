/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort_linked_list;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        ListNode endEnd = new ListNode(0);
        ListNode end = new ListNode(4, endEnd);
        ListNode tail = new ListNode(3, end);
        ListNode mid = new ListNode(5, tail);
        ListNode head = new ListNode(-1,mid);
        
        Solution3 sol = new Solution3();
        ListNode sorted = sol.sortList(head);
    }
}
