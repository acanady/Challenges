package com.acanady.duplicate;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args){
        int[] nums = new int[]{-1,0,3,4,5,-2,-1};
        System.out.println(containsDuplicate(nums));
    }

    //Function defines a set and loops through the num array attempting to add that number
    //to the set, if it can't then we've found a duplicate
    public static boolean containsDuplicate(int[] nums){
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums){
            if(!num_set.add(num))
                return true;
        }
        return false;
    }
}
