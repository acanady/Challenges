package com.acanady.challengesolutions;
import java.util.HashSet;
import java.util.Set;

/* Example main method call to function
public static void main(String[] args){
        ContainsDuplicate dup = new ContainsDuplicate();
        int[] nums = new int[]{-1,0,3,4,5,-2,-1};
        System.out.println(dup.containsDuplicate(nums));
    }
 */

public class ContainsDuplicate {

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
