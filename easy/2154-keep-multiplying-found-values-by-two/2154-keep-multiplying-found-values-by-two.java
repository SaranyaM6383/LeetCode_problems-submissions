            int n=num/k;
            if((n&(n-1)) == 0)
      
            bits |=n;
        }
        bits++;
        return k*(bits&-bits);
    }
}
        for(int num:nums){
            if(num % k !=0) continue;
        int bits=0;
class Solution {
    public int findFinalValue(int[] nums, int k) {