                    dp[i][j] = Math.min(dp[i][j],
                        dp[i][k] + dp[k][j] + v[i]*v[j]*v[k]);
                }
            }
        }
        return dp[0][n-1];
    }
}