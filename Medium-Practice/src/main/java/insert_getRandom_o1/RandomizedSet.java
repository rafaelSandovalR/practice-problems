/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insert_getRandom_o1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


/**
 *
 * @author Rsand
 */
public class RandomizedSet {
    private final Random random;
    private final Map<Integer, Integer> map;
    private int[] vals;
    private int insertIndex;
    
    public RandomizedSet(){
        random = new Random();
        map = new HashMap<>();
        vals = new int[32];
        insertIndex = 0;
    }
    
    public boolean insert(int val){
        if(map.containsKey(val)){
            return false;
        }
        
        map.put(val, insertIndex);
        
        //creates a copy of the array with double the size if necessary
        if(insertIndex >= vals.length){
            vals = Arrays.copyOf(vals,vals.length * 2);
        }
        
        vals[insertIndex++] = val;
        return true;
    }
    
    public boolean remove(int val){
        //saves array index for removed item
        Integer removed = map.remove(val);
        if(removed == null) return false;
        
        /*  if the item removed was not the last item in the array
            then it places the last item in the array into the index
            of the removed item. Then updates hashmap key/value pair
            to reflect changes
        */
        if(removed < insertIndex - 1){
            vals[removed] = vals[insertIndex-1];
            map.put(vals[insertIndex-1],removed);
        }
        
        //insertIndex decrements to overwrite item in the last index
        insertIndex--;
        return true;
    }
    
    public  int getRandom(){
        int index = random.nextInt(insertIndex);
        return vals[index];
    }
}
