package com.CrackForInternship;
import java.util.*;

public class _no_of_1_bits_ {
    /*
         191. Number of 1 Bits
         Write a function that takes an unsigned integer and returns the number of '1' bits it
         has (also known as the Hamming weight).

         Note:
         Note that in some languages, such as Java, there is no unsigned integer type. In this case,
         the input will be given as a signed integer type. It should not affect your implementation,
         as the integer's internal binary representation is the same, whether it is signed or unsigned.

         In Java, the compiler represents the signed integers using 2's complement notation. Therefore,
         in Example 3, the input represents the signed integer. -3.

         Example 1:
         Input: n = 00000000000000000000000000001011
         Output: 3
         Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.

         Example 2:
         Input: n = 00000000000000000000000010000000
         Output: 1
         Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
         Example 3:

         Input: n = 11111111111111111111111111111101
         Output: 31
         Explanation: The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.

     */
    public static void merge(int[] nums1,int[] nums2,int m,int n){
        int[] merged = new int[m+n];
        int k=0;
        for(int i=0;i<m;i++){
            merged[k]=nums1[i];
            k++;
        }
        for(int j=0;j<n;j++){
            merged[k] = nums2[j];
            k++;
        }
        Arrays.sort(merged);
        System.out.println((Arrays.toString(merged)));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,nums2,3,3);
    }
}
