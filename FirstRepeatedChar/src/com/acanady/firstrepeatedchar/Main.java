package com.acanady.firstrepeatedchar;
import java.util.*;

public class Main {


    public static String firstrepeat(String s){
        HashSet<String> characters = new HashSet<String>();

        for(int i = 0; i < s.length(); i++){
            if(!characters.add(String.valueOf(s.charAt(i)))){
                return String.valueOf(s.charAt(i));
            }
        }
        return "-1";
    }

    public static void main(String[] args){
        System.out.println(firstrepeat("character"));

    }

}


