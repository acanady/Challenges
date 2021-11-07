package com.acanady.challengesolutions;
import java.util.*;

/* Example of function call in main

public static void main(String[] args){
    FirstRepeatedCharacter frc = new FirstRepeatedCharacter();
    System.out.println(frc.firstrepeat("hello world"));
}

 */


public class FirstRepeatedCharacter {

    public static String firstrepeat(String s){
        HashSet<String> characters = new HashSet<String>();

        for(int i = 0; i < s.length(); i++){
            if(!characters.add(String.valueOf(s.charAt(i)))){
                return String.valueOf(s.charAt(i));
            }
        }
        return "-1";
    }
}
