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
        /*
                if(s.length() == 0){return true;}
    
                for(int i=0, j=0; i < t.length(); i++){

                    if(t.charAt(i) == s.charAt(j)){
                        j++;

                        if(j == s.length()){return true;}
                    }
                }
        
                return false;
        */
        
        int l = 0, r = 0;
        
        char[] main = t.toCharArray();
        char[] sub = s.toCharArray();
        
        if (sub.length == 0){ return true; }        
        if (main.length < sub.length){ return false; }
        
        while (l < main.length){
            char curr = main[1];
            if(curr == sub[r]){
                r++;
                if(r == sub.length){ return true; }
            }
            l++;
        }
        return false;
    }
}
