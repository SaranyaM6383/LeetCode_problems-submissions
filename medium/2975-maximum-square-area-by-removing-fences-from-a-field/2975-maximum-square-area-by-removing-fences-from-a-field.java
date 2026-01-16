        if (maxSide == -1) return -1;
        // 5. Return result modulo 10^9 + 7
        long MOD = 1_000_000_007;
        return (int) ((maxSide * maxSide) % MOD);
    }
}