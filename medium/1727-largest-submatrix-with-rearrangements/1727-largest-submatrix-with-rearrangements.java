                                                                                    
                    for (int j = 0; j < n; j++)
                                                                                    
                                    res = Math.max(res, matrix[i][j] * (n - j));
                                                                                    
                                            }
                                                                                    
                                                    return res;
    }