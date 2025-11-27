        minS[k-1]=0;
        long prefix=0, ans=-INF;
        for(int i=0; i<n; i++){
            prefix+=nums[i];
            int ik=i%k;
            ans=Math.max(ans, prefix-minS[ik]);
            minS[ik]=Math.min(prefix, minS[ik]);  
        }
        return ans;
    }
        for(int i=0; i<k-1; i++) minS[i]=INF;
        long [] minS=new long[k];
    public long maxSubarraySum(int[] nums, int k) {
        final long n=nums.length, INF=Long.MAX_VALUE/2;
class Solution {