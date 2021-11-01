package com.acanady.squares;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        System.out.println(Arrays.toString(squareArray()));
        //squareArray();
    }
/*
This solution uses two sepearte pointers that split the array into positive and negative sides
We start by moving the right pointer over to the first positive value, the left pointers is at the largest negative
value, remember -1 is larger than -5. We then compare the abs value of the right and left pointers, which ever value
is less we square it and add it to the squareArray, then we either increment the pointer, if on the right side, or
decrement the pointer, if on the left side. This solution runs in (O)n time but requires multiple if statements to determine
whether we have moved out of bounds of the array. (An array of only negative numbers for instance will result in a right
pointer that is out of bounds since we never found the "first positive number")

Another solution with less if statements would involve setting a pointer at the beginning and end of the array
and comparing the abs value or squared values and then adding the smaller number to the squaredArray.

 */

    public static int[] squareArray(){
        int[] nums = new int[]{-4,-3,-2,-1,1,2,34};
        int[] squares = new int[nums.length];
        int left = 0;
        int right = 0;

        //set the right value to the first non-negative integer, complexity is O(n)
        for (int i = 0; i < nums.length; i++){
            if(nums[i] < 0)
                right++;
        }
        //the left side of the array contains only negative integers
        left = right-1;
        System.out.println(right);

        for(int i = 0; i< nums.length; i++){

            //Move down the left and right sides, if the left pointers abs value is
            //less than the rights then we choose the left value and increment left
            if(left >= 0){
                if(right >= nums.length){
                    squares[i] = nums[left] * nums[left];
                    left--;
                }
                else if(nums[left]*-1 < nums[right]) {
                    squares[i] = nums[left] * nums[left];
                    left--;
                }
                //if it's not less than then we choose the right value and increment it
                else if(right < nums.length){
                    squares[i] = nums[right] * nums[right];
                    right++;
                }
            }
            else if (right < nums.length){
                squares[i] = nums[right] * nums[right];
                right++;
            }
        }
        return squares;
    }
}
