/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insert_getRandom_o1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;


/**
 *
 * @author Rsand
 */
public class RandomizedSet {
    Set<Integer> s;
    Random random;
    
    public RandomizedSet(){
        s = new HashSet<>();
        random = new Random();
    }
    
    public boolean insert(int val){
        return s.add(val);
    }
    
    public boolean remove(int val){
        return s.remove(val);
    }
    
    public  int getRandom(){
        int randomIndex = random.nextInt(s.size());
        Iterator<Integer> iterator = s.iterator();
        
        for(int i = 0; i < randomIndex; i++){
            iterator.next();
        }
        
        return iterator.next();
    }
}
