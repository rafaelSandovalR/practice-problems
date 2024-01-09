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
//        Step 5) Create variables: 
//            a) a ListNode that will end up with the head of the answer list
        ListNode prevNode = null, nextNode = null;
/*        
//        Step 6) Calculate what factor of 10 the sum is
        mFactor = (int) Math.pow(10, (String.valueOf(sum).length()-1));
//        
//        Step 7) While sum is greater than zero:
        while(sum > 0){
//            a) Create next node (we are starting at the end and moving towards the head)
            ListNode nextNode = new ListNode();
//            b) set nextNode's val to sum divided by the current factor of 10;
            nextNode.val = sum/mFactor;
//            c) set nextNode's next to prevNode
            nextNode.next = prevNode;
//            d) set sum as sum minus sum's largest digit
            sum -= nextNode.val * mFactor;
//            e) set factor to factor divided by 10
            mFactor /= 10;
//            f) set prevNode to nextNode
            prevNode = nextNode;
        }
*/
        String sumString = String.valueOf(sum);
        while(sumString != ""){
            nextNode = new ListNode(Integer.valueOf(sumString.charAt(0)), prevNode);
            sumString = sumString.substring(1);
        }
        return nextNode;
    }
}
