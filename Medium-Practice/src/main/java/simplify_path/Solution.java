/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplify_path;

import java.util.ArrayDeque;

/**
 *
 * @author Rsand
 */
public class Solution {
    public String simplifyPath(String path){

        ArrayDeque<String> stack = new ArrayDeque<>();
        
        char[] pathChars = path.toCharArray();
        
        for (int start = 0, end = 1; end < pathChars.length; start = end++){
            
            while(end < pathChars.length && pathChars[end] != '/'){
                end++;
            }
            
            stack.push(new String(pathChars, start, end-start));
        }
        
        return null;
    }
}
