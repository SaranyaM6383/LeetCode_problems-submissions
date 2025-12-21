                if (max.peekFirst() == left) max.pollFirst();
                if (min.peekFirst() == left) min.pollFirst();
                
                left++;
            }
            
            dp[i + 1] = (prefix[i + 1] - prefix[left] + MOD) % MOD;
            
            prefix[i + 2] = (prefix[i + 1] + dp[i + 1]) % MOD;
        }
        
        return dp[n];
    }
}