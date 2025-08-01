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
        Solution2 sol = new Solution2();
        int[] gas = new int[] {5,8,2,8};
        int[] cost = new int[] {6,5,6,6};
        
        int ans = sol.canCompleteCircuit(gas, cost);
        System.out.println(ans);
    }
}
