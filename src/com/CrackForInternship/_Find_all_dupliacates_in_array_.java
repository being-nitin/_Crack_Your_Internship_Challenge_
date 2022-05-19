package com.CrackForInternship;
import java.util.*;

public class _Find_all_dupliacates_in_array_ {
    /*
    442. Find All Duplicates in an Array

    Given an integer array nums of length n where all the integers of nums are
    in the range [1, n] and each integer appears once or twice, return an array
    of all the integers that appears twice.

    You must write an algorithm that runs in O(n) time and uses only constant extra space.

    Example 1:
    Input: nums = [4,3,2,7,8,2,3,1]
    Output: [2,3]

    Example 2:
    Input: nums = [1,1,2]
    Output: [1]

    Example 3:
    Input: nums = [1]
    Output: []
     */
    public static List<Integer> duplicates(int[] nums){
        Arrays.sort(nums);
        ArrayList<Integer> list  = new ArrayList<Integer>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                list.add(nums[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> list  = duplicates(arr);
        System.out.println(list);
    }
}
