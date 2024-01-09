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
        
        ArrayList<Integer> list1 = new ArrayList<>(), list2 = new ArrayList<>();
        ListNode temp = l1;
        boolean secondList = false;
        
        while(temp != null){
            if(secondList){
                list2.add(temp.val);
            } else{
                list1.add(temp.val);
            }
            temp = temp.next;
            if(temp == null & !secondList){
                temp = l2;
                secondList = true;
            }
        }
        
        int l1Size = list1.size(), l2Size = list2.size();
        int[] sum = new int[Math.max(l1Size, l2Size) + 1];
        int startingIndex = sum.length-1;
        
        for(int p1 = 0, p2 = 0, p3 = 0, subSum = 0; p1 < l1Size || p2 < l2Size; p1++, p2++, p3++){
            if(p1 < l1Size && p2 < l2Size){
                subSum = list1.get(p1) + list2.get(p2);
            }
            if(p1 >= l1Size){
                subSum = list2.get(p2);
            }
            if(p2 >= l2Size){
                subSum = list1.get(p1);
            }
            
            sum[p3] = sum[p3] + subSum % 10;
            sum[p3+1] = sum[p3] / 10;
            sum[p3] = sum[p3] % 10;
            sum[p3+1] = sum[p3+1] + subSum / 10;
            
            //node count to avoid leading zeros
            if(p3+1 == sum.length-1 && sum[p3+1] == 0){
                startingIndex = p3;
            }
        }
        
        ListNode prevNode = null, nextNode = null;

        for(int i = startingIndex; i >= 0; i--){
            nextNode = new ListNode(sum[i], prevNode);
            prevNode = nextNode;
        }
        
        return nextNode;
    }
}

