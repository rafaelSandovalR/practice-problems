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
        
        int rowCount = 1, valCount = 1;
        boolean singular = true;
        List<Integer> sub = new ArrayList<Integer>();
        matrix.add(sub);
        
        for(int i = 0, j = 0; i < nums.length; i++){
            
            //count how many valCount there are
            while(i+1 != nums.length && nums[i] == nums[i+1]){
                valCount++;
                i++;
                singular = false;
            }
            
            //if single value add to the first sublist
            if(singular){
                sub.add(nums[i]);
            }
            
            //if valCount values exist
            while(valCount > 0){
                if(valCount > rowCount){
                    List<Integer> nextSub = new ArrayList<Integer>();
                    //add new list to matrix
                    matrix.add(nextSub);
                    //increment row count
                    rowCount++;
                }
                //Add number to rows.
                matrix.get(valCount-1).add(nums[i]);
                //decrement multi
                valCount--;
            }
            
            //reset variables
            singular = true;
            valCount = 1;
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
