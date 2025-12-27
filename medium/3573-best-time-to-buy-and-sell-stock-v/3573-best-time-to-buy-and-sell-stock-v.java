        for (int day = 1; day < n; day++) {
            int currPrice = prices[day];
            for (int trans = k; trans > 0; trans--) {
                long prevProfit = dp[trans - 1].maxProfit;
                dp[trans].maxProfit = Math.max(dp[trans].maxProfit, Math.max(dp[trans].
buyHold + currPrice, dp[trans].sellHold - currPrice));
                dp[trans].buyHold = Math.max(dp[trans].buyHold, prevProfit - currPrice);
                dp[trans].sellHold = Math.max(dp[trans].sellHold, prevProfit + currPrice);
            }
        }
        
        return dp[k].maxProfit;
    }
}