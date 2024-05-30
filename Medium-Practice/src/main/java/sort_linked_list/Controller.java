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
        ListNode end = new ListNode(3);
        ListNode tail = new ListNode(1, end);
        ListNode mid = new ListNode(2, tail);
        ListNode head = new ListNode(4,mid);
        
        Solution sol = new Solution();
        ListNode sorted = sol.sortList(head);
    }
}
