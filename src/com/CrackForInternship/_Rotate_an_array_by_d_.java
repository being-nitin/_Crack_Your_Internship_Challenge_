package com.CrackForInternship;
import java.util.*;

public class _Rotate_an_array_by_d_ {
    /*
    Rotate an array left  by d , where d is any number
     */
//    1st approach
//    we will rotate the array by one and will call it d times
    public static void leftRotateOne(int[] nums,int n){
        n = nums.length;
        int temp = nums[0];
        for(int i=1;i< nums.length;i++){
            nums[i-1] = nums[i];
        }
        nums[n-1] = temp;
    }
    public static void leftRotate(int[] nums,int n,int d){
        for(int i=0;i<d;i++){
            leftRotateOne(nums,nums.length);
        }

    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9};
//        leftRotate(nums,nums.length,3);
        leftRotateOne1(nums,nums.length,3);
        System.out.println(Arrays.toString(nums));
    }

    //2nd approach
    /*
    1.in this we will take a different array and we will store first d elements in it
    2.then we will shift the shift the elements left till 0th
    3. after shifting we will store the elements of created array in existing array
     */
    public static void leftRotateOne1(int[] nums,int n,int d){
    int[] temp = new int[d];
    for(int i=0;i<d;i++){
        temp[i] = nums[i];
    }
    for(int i=d;i<nums.length;i++){
        nums[i-d] = nums[i];
    }
    for(int i=0;i<d;i++){
        nums[nums.length-d+1] = temp[i];
    }
    }
}
