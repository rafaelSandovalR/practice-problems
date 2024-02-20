/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ransom_note;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine){
        
        int[] magChars = new int[128];
        
        for(int i = 0; i < magazine.length(); i++){
            magChars[magazine.charAt(i)]++;
        }
        
        for(int i = 0; i < ransomNote.length(); i++){
            if (magChars[ransomNote.charAt(i)]-- == 0) return false;
        }
 
        return true;
        
        
 /* HASHMAP SOLUTION
            //hashmap of letter and their count
            Map<Character, Integer> m = new HashMap<>();
            char letter;
            
            for(int i = magazine.length()-1; i >= 0; i--){
                letter = magazine.charAt(i);
                
                //if letter exists in the map, increment count
                if(m.containsKey(letter)){
                    m.compute(letter, (key, val) -> val = val+1);
                } else {m.put(letter, 1);}
            }

            //traverse ransomNote string and decrement count of existing chars
            for(int i = ransomNote.length()-1; i >= 0; i--){
                letter = ransomNote.charAt(i);
                //if the letter is not in the hashmap, then return false
                if(!m.containsKey(letter)){
                    return false;
                } else{
                    m.compute(letter, (key,val) -> val = val-1);
                    if (m.get(letter) < 0){
                        return false;
                    }
                }
            }
        
            return true;
*/
    }
}
