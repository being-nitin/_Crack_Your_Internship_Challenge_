class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            // for duplicate a
            if(i==0 || nums[i-1]!=nums[i])
            twoSum(i+1,nums.length-1,nums,-nums[i]);
            }
        return result;
    }
     public  void twoSum(int i,int j,int[] nums,int target){
        int a = nums[i-1];
        while(i<j){
            if((nums[i]+nums[j])<target){
                i++;
            }
               else if((nums[i]+nums[j])>target){
                   j--;
               }
               else{
                   List<Integer> res = new ArrayList<>();
                   res.add(a);
                   res.add(nums[i]);
                   res.add(nums[j]);
                   result.add(res);
                   // for duplicate b
                   while(i<j && nums[i]==nums[i+1]){
                       i++;
                   }
                   // for duplicate c
                   while(i<j && nums[j]==nums[j-1]){
                       j--;
                   }
                   i++;
                   j--;
               }
        }
        }
    }