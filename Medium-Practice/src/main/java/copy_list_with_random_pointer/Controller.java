/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package copy_list_with_random_pointer;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        
        Node tail = new Node(1);
        Node n4 = new Node(10);
        n4.next = tail;
        
        Node n3 = new Node(11);
        n3.next = n4;
        
        Node n2 = new Node(13);
        n2.next = n3;
        
        Node n1 = new Node(7);
        n1.next = n2;
        
        n2.random = n1;
        n3.random = n4;
        n4.random = n3;
        tail.random = n1;
        
        Solution sol = new Solution();
        Node copyHead = sol.copyRandomList(n1);
    }
}
