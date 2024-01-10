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
        
        /*
        
        1. Create variable carry to hold carry value after each addition
        2. Create first answer node, prev node, next node, int var for sums
        3. While first node and second node are BOTH not null
            a. Create next node
            b. Set prev node's next to next node
            c. If neither nodes are null:
                i.      add both node vals and carry to sum
                ii.     set carry by dividing sum by 10
                iii.    set next node val by taking mod 10 of sum
            d. If first node is null, add second node val to next node
            e. If second node is null, add first node val to next node
            f. set nodes to their respective next nodes
        4. If carry > 0, create new next node with value.
        5. return first answer node
            
        
        */
        
        return nextNode;
    }
}

