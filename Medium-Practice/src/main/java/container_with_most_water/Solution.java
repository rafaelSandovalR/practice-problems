/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package container_with_most_water;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int maxArea(int[] height){
   
        int currentVol = 0, maxVol = 0;
        
        for(int i = 0, j = height.length-1; i < j;){
            
            currentVol = Math.min(height[i], height[j]) * (j-i);
            
            maxVol = Math.max(currentVol, maxVol);
            
            
            if(height[i] == height[j]){ i++; j--;}
            else if (height[i] < height[j]){ i++; }
            else{ j--; }

            
        }
        return maxVol;
    }
}
