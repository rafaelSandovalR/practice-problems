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
            
            // Determine start and end indices for each subdirectory
            while(end < pathChars.length && pathChars[end] != '/'){
                end++;
            }
            
            // Determine actions based on subdirectory to build stack
            String directory = new String(pathChars, start, end - start);
            switch (directory){
                case "/":
                case "/.":
                    break;
                case "/..":
                    if (!stack.isEmpty()){
                        stack.pop();
                    }
                    break;
                default:
                    stack.push(directory);
            }
            
        }
        
        // Concatenate stack strings in FIFO order
        StringBuilder simplifiedPath = new StringBuilder();
        while (!stack.isEmpty()){
            String bottom = stack.pollLast();
            simplifiedPath.append(bottom);
        }
        
        return simplifiedPath.length() == 0 ? "/" : simplifiedPath.toString();
    }
}
