                sub=i;
            
            }
            dp[i]=dp[i-sub]+1;
        }
        return dp;
    }
}
        int sub=1;
        for(int i=1;i<=n;i++){
            if(sub*2==i){