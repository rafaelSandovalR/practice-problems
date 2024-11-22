/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clone_graph;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        
        n1.neighbors.add(n2);
        n1.neighbors.add(n4);
        
        n2.neighbors.add(n1);
        n2.neighbors.add(n3);
        
        n3.neighbors.add(n2);
        n3.neighbors.add(n4);
        
        n4.neighbors.add(n1);
        n4.neighbors.add(n3);
        
        Solution sol = new Solution();
        
        Node clone = sol.cloneGraph(n1);
        
    }
}
