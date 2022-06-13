class Solution {
    public int missingNumber(int[] nums) {
        int res=0,xor=0,k=0;
            for(int i=0;i<nums.length;i++){
                res = res^nums[i];
                xor = xor^i;
                k++;
                }
        xor = xor^(k);
            
        return xor^res;
}
}