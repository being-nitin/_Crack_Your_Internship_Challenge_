class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
            for(int index=0;index<nums.length;index++){
                if(nums[index]!=index){
                   return index; 
                }
            }
        return nums.length;
    }
    void swap(int[] nums,int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}