/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array_into_2d;

import java.util.List;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<Integer>> matrix;
        
        int[] arr = {1,3,4,1,2,3,1};
        
        matrix = s.findMatrix2(arr);
        displayResults(matrix);
    }
    
    public static void displayResults(List<List<Integer>> matrix){
        
        /*
        display matrix like this:
        [1, 2, 3, 4]
        [1, 3]
        [1]
        */
        for(List<Integer> row : matrix){
            System.out.print("[");
            for(int i = 0; i < row.size(); i++){
                System.out.print(row.get(i));
                if(i != row.size()-1){
                    System.out.print(", ");
                } else {
                    System.out.println("]");
                }
            }
        }
    }
}
