            }
        }
                num =num>>1;
        int ans=0;
        for(int i=0;i<31;i++){
            if(dp[i]>=k){
                ans+=(1<<i);
            }
        }
    }
        return ans;
}