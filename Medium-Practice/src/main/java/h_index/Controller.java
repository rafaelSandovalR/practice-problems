/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h_index;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] citations = {1,2,3,2,4,1,5};
        
        int hIndex = sol.hIndex(citations);
    }
}
