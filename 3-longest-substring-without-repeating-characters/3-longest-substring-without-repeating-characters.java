class Solution {
    public int lengthOfLongestSubstring(String s) {
        // initially we are taking two pointers;
        int left=0;
        int right =0;
        // right pointer will move till it gets the non repeating characters:
        // will take a set to store uniwue characters.
        // will take a max variable to store the length of substring
        int max=0;
        Set<Character> sets = new HashSet();
        while(right<s.length()){
            char ch = s.charAt(right);
            if(sets.add(ch)){
            max = Math.max(max,right-left+1);
            right++;
        }
            else{
                while(s.charAt(left)!=ch){
                    sets.remove(s.charAt(left));
                    left++;
                }
                sets.remove(ch);
                left++;
            }
    }
        return max;
               
    }
}