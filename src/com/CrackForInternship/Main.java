package com.CrackForInternship;
import java.util.*;
public class Main {

    public static void main(String[] args) {
            //Two sum problem
        int[] arr = {1,4,7,2,7};
        System.out.println(Arrays.toString(twoSum(arr,3)));
    }
    public static int[] twoSum(int[] arr, int target){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if((arr[i]+arr[j]==target)){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
