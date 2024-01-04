/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array_into_2d;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rsand
 */
public class Solution {
    public List<List<Integer>> findMatrix(int[] nums){
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();
        
        quickSort(nums, 0 , nums.length-1);
        
        int rowCount = 0, multiCount = 0;
        List<Integer> sub = new ArrayList<Integer>();
        matrix.add(sub);
        
        for(int i = 0; i < nums.length; i++){
            while(i+1 != nums.length && nums[i] == nums[i+1]){
                multiCount++;
                i++;
            }
            
            if(multiCount == 0){
                sub.add(nums[i]);
            }
            
            while(multiCount > 0){
                if(multiCount > rowCount){
                    List<Integer> nextSub = new ArrayList<Integer>();
                    //Add number to list
                    //decrement multi
                    //increment row count
                }
                else{
                    //Add number to existing rows.
                }

            }
            
        }
        
        return matrix;
    }
    
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    //takes last element as pivot
    public static int partition(int[]arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        
        for(int j = low; j <= high - 1; j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr, i , j);
            }
        }
        
        swap(arr, i+1, high);
        return i+1;
    }
}
