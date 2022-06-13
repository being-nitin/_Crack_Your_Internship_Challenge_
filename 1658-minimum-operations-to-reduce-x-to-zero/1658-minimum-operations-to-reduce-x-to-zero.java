class Solution {
    public int minOperations(int[] nums, int x) {
        int target = -x;
        for(int ele:nums){
            target = target+ele;
            }
        if(target==0) return nums.length;
        if(target<0) return -1;
        int res=-1,sum=0,left=0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            while(sum>target){
                sum = sum-nums[left++];
            }
            if(sum==target){
                res = Math.max(res,i-left+1);
            }
        }
        return res==-1 ? -1 : nums.length-res;
    }
        
}