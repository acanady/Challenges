package com.acanady.challengesolutions;

public class MergeSortedArray {
    /* Example of function call in main
     public static void main(String[] args){
        MergeSortedArray msr = new MergeSortedArray();
        int[] nums1 = new int[]{1,0,0,0,0};
        int[] nums2 = new int[]{-3,-2,1,2};
        int m = 1;
        int n = 4;
        msr.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }
     */


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int m_pointer = m-1;
        int n_pointer = n-1;



        for(int i =m+n-1; i >= 0; i--){

            /*System.out.println("i: " + i + " | m pointer: " + m_pointer + " | n pointer: " + n_pointer);
            System.out.println(Arrays.toString(nums1));*/

            if(m_pointer < 0){
                nums1[i] = nums2[n_pointer];
                n_pointer--;
                continue;
            }
            else if (n_pointer < 0){
                nums1[i] = nums1[m_pointer];
                m_pointer--;
                continue;
            }

            if(nums1[m_pointer] < nums2[n_pointer]){
                nums1[i] = nums2[n_pointer];
                n_pointer--;
            }
            else{
                nums1[i] = nums1[m_pointer];
                m_pointer--;
            }

            /*System.out.println("i: " + i + " | m pointer: " + m_pointer + " | n pointer: " + n_pointer);
            System.out.println(Arrays.toString(nums1));
            System.out.println("---------------------------------");*/
        }
    }

}
