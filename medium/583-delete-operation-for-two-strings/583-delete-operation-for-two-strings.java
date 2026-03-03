        char[] str1 = word1.toCharArray();
                char[] str2 = word2.toCharArray();
                        int n = str1.length;
                                int m = str2.length;
                                        int[][] dp = new int[n + 1][m + 1];
                                                // Standard LCS DP approach
                                                        for (int i = 1; i <= n; i
++) {