package com.CrackForInternship;
import java.util.*;

public class SearchInRange {
    public static int search(int[] arr,int target,int start,int end){
        for(int i=start;i<=end;i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,6,4,2,8,7};
        System.out.println(search(arr,6,1,3));
    }
}
