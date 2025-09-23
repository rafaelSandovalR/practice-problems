/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trapping_rain_water;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int trap(int[] height){
        
        /*  Two pass idea: using an auxillary array store potential water above
            each index, after a downward slope and until you rise above left
            wall height; 
        
            height = [0,1,0,2,1,0,1,3,2,1,2,1]
            aux =    [0,0,1,0,1,2,1,0,1,2,1,2] <- first pass
        
            On the second pass, going backwards, determine actual water stored
            based on right wall height;
        
            height = [0,1,0,2,1,0,1,3,2,1,2,1]
            aux =    [0,0,1,0,1,2,1,0,1,2,1,2] <- first pass
            aux =    [0,0,1,0,1,2,1,0,0,1,0,0] <- second pass
            actual is min(aux[i], maxRightWallHeight)
            count += actual water stored;
            return count;
        */
    }
}
