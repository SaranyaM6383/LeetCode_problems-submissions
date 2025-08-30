class Solution {
    public int gcdOfOddEvenSums(int n) {
        return gcd(n*(n+1),n*n);
    }
    public int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,(a%b));
    }
}
