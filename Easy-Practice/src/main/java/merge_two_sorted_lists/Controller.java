/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merge_two_sorted_lists;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        
        ListNode tail1 = new ListNode(4);
        ListNode mid1 = new ListNode(2,tail1);
        ListNode head1 = new ListNode(1,mid1);
        
        ListNode tail2 = new ListNode(4);
        ListNode mid2 = new ListNode(3, tail2);
        ListNode head2 = new ListNode(1, mid2);
        
        Solution sol = new Solution();
        ListNode mergedHead = sol.mergeTwoLists(head1, head2);
    }
}
