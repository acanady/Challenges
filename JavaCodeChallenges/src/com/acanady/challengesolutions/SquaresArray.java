package com.acanady.challengesolutions;

public class SquaresArray {

    public int[] squareArraySol1(int[] nums){

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

    public int[] squareArraySol2(int nums[]){
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
