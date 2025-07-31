/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gas_station;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost){
        int n = gas.length;
        int ans = -1;
        
        for (int i = 0; i < n; i++){
            if (canCompleteCircuit(gas, cost, i)) ans = i;
        }
        
        return ans;
    }

    private boolean canCompleteCircuit(int[] gas, int[] cost, int start) {
        int n = gas.length;
        int tank = 0;
        for (int i = 0; i < n; i++){
            int idx = (start + i) % n;
            tank += gas[idx];
            tank -= cost[idx];
            if (tank < 0) return false;
        }
        
        return true;
    }
}
