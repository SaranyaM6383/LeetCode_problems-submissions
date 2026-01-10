        int total = 0;
        for (char c : s1.toCharArray()) total += c;
        for (char c : s2.toCharArray()) total += c;
        return total - 2 * dp[n][m];
    }
}