        
        for (int num : nums) {
            int[] current = dp.clone();
            
            for (int sum : current) {
                int newSum = sum + num;
                int remainder = newSum % 3;
                dp[remainder] = Math.max(dp[remainder], newSum);
            }
        }
        
        return dp[0];
    }
}