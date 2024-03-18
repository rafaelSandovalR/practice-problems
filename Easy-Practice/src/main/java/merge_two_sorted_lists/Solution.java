/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merge_two_sorted_lists;

/**
 *
 * @author Rsand
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if (list1 == null && list2 == null) return null;
        
        ListNode head = null;
        ListNode temp = null;
        
        while (list1 != null || list2 != null){
            if (list1 == null) {
                if (head == null) {
                    head = list2;
                }
                temp.next = list2;
                break;
            }
            if (list2 == null) {
                if (head == null) {
                    head = list1;
                }
                temp.next = list1;
                break;
            }
            
            if (list1.val <= list2.val){
                if (head == null){ 
                    head = list1;
                } else{
                    temp.next = list1;
                }
                temp = list1;
                list1 = list1.next;
            } else {
                if (head == null) {
                    head = list2;
                } else{
                    temp.next = list2;
                }
                temp = list2;
                list2 = list2.next;
            }
        }
        
        return head;
    }
}
