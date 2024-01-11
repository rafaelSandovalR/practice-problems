/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package add_two_numbers;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        ListNode l1 = setNodes(9,9,9,9,9,9,9);
        ListNode l2 = setNodes(9,9,9,9);
        
        Solution s = new Solution();
        
        s.addTwoNumbers(l1, l2);
        
        int test = 807;
        System.out.println(28 % 10);
        System.out.println(28 / 10);
    }
    
    public static ListNode setNodes(int... numbers){
        int count = 1;
        ListNode head = new ListNode(numbers[0]);
        ListNode current = new ListNode();
        if(numbers.length != 1){head.next = current;} 
        
        //create nodes for each number
        for(int number : numbers){
            if(count != 1) {
                current.val = number; 
                if(count < numbers.length){
                    ListNode nextNode = new ListNode();
                    current.next = nextNode;
                    current = nextNode;
                }
            }
            count++;
        }
        
        return head;
    }
}

