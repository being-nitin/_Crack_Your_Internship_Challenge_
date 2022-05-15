package com.CrackForInternship;
import java.util.*;

public class _Move_zeroes_  {
    /*
    283. Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
     */
    public static void moveZeroes(int[] nums){
        int start=0,end=nums.length;
        for(int i=0;i<end;i++){
            if(nums[i]!=0){
                nums[start]=nums[i];
                start++;
            }
        }
        while(start<end){
            nums[start]=0;
            start++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}



