class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int start=0;
        int end = 0;
        int runningSum = 0;
        int maxsum = 0;
        while(end<nums.length){
            if(!set.contains(nums[end])){
                set.add(nums[end]);
                runningSum = runningSum+nums[end];
                maxsum = Math.max(maxsum,runningSum);
                end++;
            }
            else{
                set.remove(nums[start]);
                runningSum = runningSum-nums[start];
                start++;
            }
        }
        return maxsum;
    }
            
}