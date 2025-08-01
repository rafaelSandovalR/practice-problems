/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gas_station;

/**
 *
 * @author Rsand
 */
public class Solution2 {
    public int canCompleteCircuit(int[] gas, int[] cost){
        int n = gas.length, totalSurplus = 0, surplus = 0, start = 0;
        
        for (int i = 0; i < n; i++){
            totalSurplus += gas[i] - cost[i];
            surplus += gas[i] - cost[i];
            
            if (surplus < 0){
                surplus = 0;
                start = i+1;
            }
        }
            return totalSurplus < 0 ? -1 : start;
        
    }
}
