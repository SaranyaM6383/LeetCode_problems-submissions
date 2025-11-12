            int gcd = nums[i];
            for(int j=i+1;j<n;j++) {
                gcd = findGcd(gcd, nums[j]);
                if(gcd == 1) {
                    int sublen = j-i+1;
                    int count = (sublen - 1) + (n-1);
                    ans = Math.min(ans,count);
                }
            }
        }
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}