/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insert_interval;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6, 7},{8,10},{12,16}};
        int[][] intervals2 = {{1,5}};
        int[] newInterval = {0,0};
        Solution sol = new Solution();
        int[][] result = sol.insert(intervals2, newInterval);
    }
}
