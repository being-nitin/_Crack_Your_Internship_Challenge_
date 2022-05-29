class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] states = new int[n];
        for(int i=0;i<n;i++){
            states[i] = getStageNumber(words[i]);
        }
        int maxProduct = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((states[i]&states[j])==0){
                    if((words[i].length()*words[j].length())>maxProduct){
                        maxProduct = words[i].length()*words[j].length();
                    }
                }
            }
        }
        return maxProduct;
    }
    private int getStageNumber(String str){
        int state =0;
        for(char ch:str.toCharArray()){
            int index = ch-'a';
            state |= 1<<(index);
        }
        return state;
    } 
}