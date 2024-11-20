/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package populating_next_right_pointers;


/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        
        
        // [2,1,3,0,7,9,1,2,null,1,0,null,null,8,8,null,null,null,null,7]
//        Node n15 = new Node(5);
//        Node n14 = new Node(5);
        Node n13 = new Node(7);
        Node n12 = new Node(8);
        Node n11 = new Node(8);
        Node n10 = new Node(0,n13,null,null);
        Node n9 = new Node(1);
        Node n8 = new Node(2);
        Node n7 = new Node(1,n11,n12,null);
        Node n6 = new Node(9);
        Node n5 = new Node(7,n9,n10,null);
        Node n4 = new Node(0,n8,null,null);
        Node n3 = new Node(3,n6,n7,null);
        Node n2 = new Node(1,n4,n5,null);
        Node root = new Node(2,n2,n3,null);
        

        Solution sol = new Solution();
        Node connected = sol.connect(root);
        
        
    }
}
