package com.acanady.squares;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        int[] nums = new int[]{-10,-9,2,6,7,19,20,};

        System.out.println(Arrays.toString(squareArraySol2(nums)));
    }
/*
Note on solution 1
This solution uses two separate pointers that split the array into positive and negative sides
We start by moving the right pointer over to the first positive value, the left pointers is at the largest negative
value, remember -1 is larger than -5. We then compare the abs value of the right and left pointers, which ever value
is less we square it and add it to the squareArray, then we either increment the pointer, if on the right side, or
decrement the pointer, if on the left side. This solution runs in (O)n time but requires multiple if statements to determine
whether we have moved out of bounds of the array. (An array of only negative numbers for instance will result in a right
pointer that is out of bounds since we never found the "first positive number")

Note on solution 2
Another solution with less if statements would involve setting a pointer at the beginning and end of the array
and comparing the abs value or squared values and then adding the bigger number to the squaredArray starting from the end.
We start from the end because, if we treat the array as two seperate sorted arrays with one sorted "backwards" (backwards because
the negative portion is backwards when squared), then comparing the first value of the backwards array gives you the largest
value that array holds, so the new array must likewise be filled in backwards.

 */
    public static int[] squareArraySol1(int[] nums){

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

    public static int[] squareArraySol2(int nums[]){
        int left = 0;
        int right = nums.length-1;
        int lnum;
        int rnum;

        int[] squareArray = new int[nums.length];
        for(int i = squareArray.length-1; i >=0; i--){
            lnum = nums[left] * nums[left];
            rnum = nums[right] * nums[right];

            if(lnum > rnum){
                squareArray[i] = lnum;
                left++;
            }
            else{
                squareArray[i] = rnum;
                right--;
            }
        }
        return squareArray;
    }
}
