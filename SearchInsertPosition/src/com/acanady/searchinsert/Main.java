package com.acanady.searchinsert;

public class Main {



    public static int search(int[] nums, int number){
        int min = 0;
        int max = nums.length-1;
        int pivot = max / 2;

        if(nums.length == 0)
            return min;

        while(true){
            if(min >= max){
                if(nums[min] == number){
                    System.out.println("number found");
                    return min;
                }
                else{
                    if(nums[min] > number)
                        return min;
                    else if (nums[min] < number)
                        return min + 1;
                }
            }
            if(nums[pivot] == number){
                System.out.println("number found");
                return pivot;
            }
            else if(nums[pivot] > number){
                max = pivot-1;
                pivot = (max - min) / 2 + min;
            }
            else{
                min = pivot+1;
                pivot = (max - min) / 2 + min;
            }
        }
    }

    public static void main(String[] args){
        int[] nums = new int[]{};
        System.out.println(search(nums, 30));
    }

}
