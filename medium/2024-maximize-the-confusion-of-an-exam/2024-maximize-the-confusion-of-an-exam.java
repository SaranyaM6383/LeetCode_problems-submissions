       for(int r=0;r<n;r++){
        maxf=Math.max(maxf,++count[s.charAt(r)-'A']);
        while(r-l+1>maxf+k){
            --count[s.charAt(l++)-'A'];
       int[] count=new int[26];
       int maxf=0;
       int result=0;
       int n=s.length();
    public int maxConsecutiveAnswers(String s, int k) {
       int l=0;
class Solution {