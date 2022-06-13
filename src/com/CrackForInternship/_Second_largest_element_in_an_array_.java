package com.CrackForInternship;
import java.util.*;

public class _Second_largest_element_in_an_array_ {
    /*
    Find the second largest element in an array.
     */
    public static int getLargest(int[] nums,int n){
        int max = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[max]){
                max = i;
            }
        }
        return max;
    }

    public static int getSecondMax(int[] nums,int n){
        int largest = getLargest(nums,n);
        int res=-1;
        for(int i=0;i<n;i++){
            if(nums[i]!=nums[largest]){
                if(res==-1){
                    res=i;
                }
                else if(nums[i]>nums[res]){
                    res = i;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5,9,12,20,10};
        int get2Largest = getSecondMax(arr,arr.length);
        System.out.println(get2Largest);
    }
}
