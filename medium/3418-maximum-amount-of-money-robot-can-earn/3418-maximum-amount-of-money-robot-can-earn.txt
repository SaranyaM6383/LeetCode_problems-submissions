                                                  if (j > 0 && k > 0) dp[i][j][k] = 
Math.max(dp[i][j][k], dp[i][j - 1][k - 1]);
                                                                                     
                                                                                     
                                                                  }
                                                                                     
                                                                                     
                                                                          return 
Math.max(dp[n - 1][m - 1][0], Math.max(dp[n - 1][m - 1][1], dp[n - 1][m - 1][2]));