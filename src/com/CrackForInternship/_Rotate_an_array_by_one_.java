 package com.CrackForInternship;
import java.util.*;

public class _Rotate_an_array_by_one_ {
    /*
    Rotate an array by one.
     */
//    I/P = {1,2,3,4,5};
//    O/P = {2,3,4,5,1}

    public static void rotate(int[] nums,int n){
        int temp = nums[0];
        for(int i=1;i< nums.length;i++){
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        rotate(nums, nums.length);
        System.out.println(Arrays.toString(nums));

    }
}
