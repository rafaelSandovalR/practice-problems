/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package middle_of_linked_list;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution s = new Solution();
        
        ListNode head1 = setNodes(1,2,3,4,5,6);
        ListNode middleNode = s.middleNode(head1);
        
        System.out.print("[");
        while(middleNode != null){
            System.out.print(middleNode.val);
            if(middleNode.next != null){
                System.out.print(",");
            }
            middleNode = middleNode.next;
        }
        
        System.out.print("]");
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
