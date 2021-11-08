package com.acanady.challengesolutions;

import java.util.*;

public class IntersectionTwoArrays {

    public int[] intersect(){
        int temp =0;
        int[] nums1 = new int[]{0,2,2,3,4,4,4,4,1};
        int[] nums2 = new int[]{2, 2,1,3,4};
        List<Integer> inter =new ArrayList<Integer>();
        Hashtable<Integer,Integer> freq = new Hashtable<Integer,Integer>();

        /*
        Create a hastable with the values from num1 and their frequencies
        * Loop through nums2 and check if key exists, if it does and it's freq is > 0
        * then add it to new array and decrement its frequency
         */


        for(int i = 0; i < nums1.length; i++){
            if(freq.containsKey(nums1[i]) == false){
                //System.out.println(nums1[i] + " does not exist, adding it now");
                freq.put(nums1[i],1);
            }
            else{
                //System.out.println(nums1[i] + " does exist, incrementing it's value");
                temp = freq.get(nums1[i]) + 1;
                freq.put(nums1[i], temp);
            }
        }

        System.out.println(freq.toString());

        for(int i = 0; i < nums2.length; i++){
            if(freq.containsKey(nums2[i])){
                temp = freq.get(nums2[i]);
                if(temp > 0){
                    inter.add(nums2[i]);
                    temp--;
                    freq.put(nums2[i], temp);
                }
            }
        }


        //Change list to integer array and return it
        int[] ret = new int[inter.size()];
        Iterator<Integer> iterator = inter.iterator();
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = iterator.next().intValue();
        }
        return ret;
    }

}
