class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int [] cnt=new int[26];
        int ans=0;
        for(int i=0;i<n;i++){
            Arrays.fill(cnt,0);
            int mx=0,v=0;
            for(int j=i;j<n;++j){
                int c=s.charAt(j)-'a';