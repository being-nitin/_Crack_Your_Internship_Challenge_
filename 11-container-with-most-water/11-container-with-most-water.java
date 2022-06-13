class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left=0,right=height.length-1;
        int length,width;
        while(left<right){
            length = Math.min(height[left],height[right]);
            width = right-left;
            maxWater = Math.max(maxWater,length*width);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
        }
}