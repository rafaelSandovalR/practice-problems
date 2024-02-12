/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package is_subsequence;

/**
 *
 * @author Rsand
 */
public class Solution {
    public boolean isSubsequence(String s, String t){
    
        for(int i=0, j=0; i < t.length(); i++){
            
            if(t.charAt(i) == s.charAt(j)){
                j++;
                
                if(j == s.length()){return true;}
            }
        }
        
        return false;
    }
}
