class Solution {
    public List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
        if(i!=0 && nums[i]==nums[i-1]){
            continue;
        }
            for(int j=i+1;j<nums.length-2;j++){
            if(j!=i+1 && nums[j]==nums[j-1]){
                continue;
            }
                int start = j+1;
                int end = nums.length-1;
                while(start<end){
                    int sum = nums[i]+nums[j]+nums[start]+nums[end];
                    if(sum<target){
                        start++;
                        }
                    else if(sum>target){
                        end--;
                    }
                    else{
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[start]);
                        ans.add(nums[end]);
                        result.add(ans);
                        start++;
                        end--;
                        while(start<end && nums[start]==nums[start-1]){
                            start++;
                        }
                        while(start<end && nums[end]==nums[end+1]){
                            end--;
                        }
                    }
                }
            }
        
        }
        return result;
        }
}