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
        
        
        int leftWall = 0, rightWall = 1, total = 0, end = height.length-1;
        
        // Find left wall (first peak)
        while (leftWall < end-1){
            if (height[leftWall] > height[rightWall]){ // When downslope begins
                int potential = 0, nextMax = 0, nextIdx = -1;
                while (rightWall < end && height[leftWall] > height[rightWall]){
                    potential += height[leftWall] - height[rightWall++];
                    if (height[rightWall] > nextMax){ // Find next highest right wall
                        nextMax = height[rightWall];
                        nextIdx = rightWall;
                    }
                }
                
                if (height[leftWall] <= height[rightWall]){
                    total += potential;
                    leftWall = rightWall-1;
                }
                
            }
            leftWall++; rightWall++;
        }
        
        
        
    }
}
