package com.CrackForInternship;
import javax.lang.model.util.AbstractElementVisitor14;
import java.util.*;

public class _FInd_all_numbers_disappeared_in_array_ {
    /*
    448. Find All Numbers Disappeared in an Array

        Given an array nums of n integers where nums[i] is in the range [1, n],
        return an array of all the integers in the range [1, n] that do not appear in nums.

        Example 1:

        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [5,6]

        Example 2:
        Input: nums = [1,1]
        Output: [2]
     */
    public static List<Integer>  missing(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        int[] result = new int[nums.length+1];
        for(int num:nums){
            result[num] = num;
        }
        for(int i=1;i<result.length;i++){
            if(result[i]==0){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> list = missing(nums);
        System.out.println(list);
    }
}
