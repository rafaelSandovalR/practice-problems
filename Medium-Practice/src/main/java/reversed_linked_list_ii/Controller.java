/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reversed_linked_list_ii;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        ListNode tail = new ListNode(7);
        ListNode n6 = new ListNode(6,tail);
        ListNode n5 = new ListNode(5,n6);
        ListNode n4 = new ListNode(4,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode head = new ListNode(1,n2);
        
        Solution sol = new Solution();
        
        ListNode reversed = sol.reverseBetween(head, 2, 6);
        
    }
}
