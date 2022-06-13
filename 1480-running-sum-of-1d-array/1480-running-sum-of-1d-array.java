class Solution {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=1;i<=nums.length;i++){
            int sum=0;
            for(int j=0;j<i;j++){
                sum = sum +nums[j];
                }
            res[i-1]=sum;
        }
        return res;
        }
}