package com.CrackForInternship;
import java.util.*;

public class _Reverse_an_array_ {
    public static void reverse(int[] nums){
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
