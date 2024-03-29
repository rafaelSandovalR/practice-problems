/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package add_two_numbers;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        
        ListNode head = new ListNode();
        ListNode nextNode = head;
        int carry = 0;
        int sum = 0;

        while (l1 != null || l2 != null || carry > 0) {

            if (l1 != null) {
                sum += l1.val;
            }
            if (l2 != null) {
                sum += l2.val;
            }
            
            // Add previous carry
            sum += carry;
            // Get new carry
            carry = sum / 10;
            // Set sum as the value of this node
            sum = sum % 10;
            nextNode.val = sum;
            // Reset Sum
            sum = 0;
             
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            
            //Create and link next node
            if (l1 != null || l2 != null || carry > 0) {
                nextNode.next = new ListNode();
                nextNode = nextNode.next;
            }
        }

        return head;
        
/*
        1. Create variable carry to hold carry value after each addition
        2. Create first answer node, prev node, next node, int var for sums
        3. Set first node and carry
        4. While first node and second node are BOTH not null
            a. Create next node
            b. Set prev node's next to next node
            c. If neither nodes are null:
                i.      add both node vals and carry to sum
                ii.     set carry by dividing sum by 10
                iii.    set next node val by taking mod 10 of sum
            d. If first node is null, add second node val to next node
            e. If second node is null, add first node val to next node
            f. set nodes to their respective next nodes
        5. If carry > 0, create new next node with value.
        6. return first answer node
*/

/*
        //1, 2
        int carry = 0, sum = 0;
        ListNode ans = null, prev = null, next;
        //3

        //4
        while (l1 != null || l2 != null){
            
            if(l1 != null && l2 != null){
                sum = l1.val + l2.val + carry;
            }
            if(l1 == null){ sum = l2.val + carry;}
            if(l2 == null){ sum = l1.val + carry;}
            
            carry = sum / 10;
            sum = sum % 10;
            next = new ListNode(sum);
            //for first node
            if(prev == null){
                ans = next;
            } else{
                prev.next = next;

            }
            
            if(next != null){ prev = next;}
            if(l1 != null) {l1 = l1.next;}
            if(l2 != null) {l2 = l2.next;}
        }
        
        //5
        if(carry > 0){
            ListNode last = new ListNode(carry);
            prev.next = last;
        }
        
        return ans;
*/
    }
}

