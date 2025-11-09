class Solution {
    public int countOperations(int a, int b) {
        return(a==0 || b==0)?0:a/b+countOperations(b,a%b);
            }
}