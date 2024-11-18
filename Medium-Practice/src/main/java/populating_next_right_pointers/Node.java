/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package populating_next_right_pointers;

/**
 *
 * @author Rsand
 */
public class Node {
    int val;
    Node left;
    Node right;
    Node next;
    
    Node(){}
    Node(int val){ this.val = val; }
    Node(int val, Node left, Node right, Node next){
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = next;
    }
}
