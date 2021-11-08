package com.acanady.challengesolutions;

public class TwoSumInputII {

    public int[] twoSum(int[] numbers, int target) {
        int[] loc = new int[2];
        int min = 0;
        int max = numbers.length - 1;
        int temp =0;

        for(int i = 0; i < numbers.length; i++){
            temp = numbers[min] + numbers[max];
            if(temp > target)
                max--;
            if(temp < target )
                min++;
            else{
                loc[0] = min+1;
                loc[1] = max+1;
            }

        }
        return loc;
    }
}
