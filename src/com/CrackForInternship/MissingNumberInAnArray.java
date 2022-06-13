package com.CrackForInternship;
import java.util.*;

public class MissingNumberInAnArray {
        public static int missingNo(int[] nums){
            int res=0,xor=0;
            int k=1;
            for(int i=0;i<nums.length;i++){
                 res = res^nums[i];
                 xor = xor^k;
                 k++;
            }
            xor = xor^k;
            return xor^res;
        }

    public static void main(String[] args) {
        int[] nums = {1,4,5,2};
        System.out.println(missingNo(nums));
    }
    }