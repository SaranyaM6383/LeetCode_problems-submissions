                                                                                    
                                                            (dp[i][j-1][0]+dp[i]
[j-1][1]-over1+MOD)%MOD;
                                                                                    
                                                                    }
                                                                                    
                                                                            return 
(int)((dp[zero][one][0]+dp[zero][one][1])%MOD);
    }