/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gas_station;

/**
 *
 * @author Rsand
 */
public class Controller {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] gas = new int[] {0,0,0,0,0,0,2};
        int[] cost = new int[] {0,0,0,0,0,1,0};
        
        int ans = sol.canCompleteCircuit(gas, cost);
    }
}
