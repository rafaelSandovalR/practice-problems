/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package add_two_numbers;

/**
 *
 * @author Rsand
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
//        Step 1: Create two variables:
//            a) an int to calculate sum: start with 0
//            b) an int to determine multiplying factor: start with 1
        int sum = 0, mFactor = 1;
        boolean secondList = false;
//        Step 3: While node is not null:
        while(l1 != null){
//            a) add sum and (node value times multiplying factor)
            sum += (l1.val * mFactor);
//            b) multiply mFactor by 10
            mFactor *= 10;
//            c) set l1 to l1.next
            l1 = l1.next;
//            d) if next is null, reset mFactor to 1
            if(l1 == null && !secondList){
                mFactor = 1;
                l1 = l2;
                secondList = true;
            }
        }
//       
//        Step 4) Repeat Step 2 & 3 for List 2;
//        
//        Step 5) Create variables: 
//            a) a ListNode that will end up with the head of the answer list
        ListNode prevNode = null;
//            b) an int that holds what factor of ten the sum is:
//        
//        Step 6) Calculate what factor of 10 the sum is
//        
//        Step 7) While sum is greater than zero:
//            a) Create next node (we are starting at the end and moving towards the head)
        ListNode nextNode = new ListNode();
//            b) set nextNode's val to sum divided by the current factor of 10;
//            c) set nextNode's next to prevNode
//            d) set sum as sum minus sum's largest digit
//            e) set factor to factor divided by 10
//            f) set prevNode to nextNode
        return nextNode;
    }
}
