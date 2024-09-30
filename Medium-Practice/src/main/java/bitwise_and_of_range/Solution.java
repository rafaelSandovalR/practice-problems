/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bitwise_and_of_range;

/**
 *
 * @author Rsand
 */
public class Solution {
    public int rangeBitwiseAnd(int left, int right){
        int count = 0;
        
        while (left != right){
            left >>= 1;
            right >>= 1;
            count++;
        }
        
        return (left << count);
    }
}
