package com.CrackForInternship;
import java.util.*;

public class checkArrayIsSorted {
    /*
    check array is sorted or not:
     */
    public static boolean sorted(int[] nums){
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0};
        boolean res = sorted(arr);
        System.out.println(res);
    }
}
