class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet st=new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
        String sub=s.substring(i,i+k);
        st.add(sub);
}
        int comb=(1<<k);
        return comb==st.size();
}
}