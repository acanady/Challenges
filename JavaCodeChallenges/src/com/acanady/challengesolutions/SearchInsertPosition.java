package com.acanady.challengesolutions;

public class SearchInsertPosition {
/* Example of function call in main
 public static void main(String[] args){
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = new int[]{10,20,25,30};
        System.out.println(sip.search(nums, 30));
    }
 */


    public static int search(int[] nums, int number){
        int min = 0;
        int max = nums.length-1;
        int pivot = max / 2;

        if(nums.length == 0)
            return min;

        while(true){
            if(min >= max){
                if(nums[min] == number){
                    //System.out.println("number found");
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
                //System.out.println("number found");
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

}
