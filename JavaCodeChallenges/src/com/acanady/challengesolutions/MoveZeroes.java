package com.acanady.challengesolutions;

import java.util.Arrays;

public class MoveZeroes {

    int[] nums = new int[]{1,2,3,4};

    public void move(){
        int zeroCount = 0;

        for(int i =0; i < nums.length; i++){
            if(nums[i] != 0){
                if(i > 0) {
                    nums[i - zeroCount] = nums[i];
                }
            }
            else{
                zeroCount++;
            }
        }

        for(int i = nums.length -1; i >= (nums.length- zeroCount); i--){
            nums[i] =0;
        }

        System.out.println(Arrays.toString(nums));
    }

}
