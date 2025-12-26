        for(int i=0; i<n; i++){
            final int x=prices[i];
            sum[i+1]=sum_+=strategy[i]*x; 
            modify+=((i>=k2 & i<k)?x:0);
        }
        long profit=Math.max(sum[n], modify+sum[n]-sum[k]);
        for(int i=1; i+k<=n; i++){ 
            modify+=prices[i+k-1]-prices[i+k2-1];
            profit=Math.max(profit, modify+sum[n]-sum[i+k]+sum[i]);
        }
        return profit;
    }
}