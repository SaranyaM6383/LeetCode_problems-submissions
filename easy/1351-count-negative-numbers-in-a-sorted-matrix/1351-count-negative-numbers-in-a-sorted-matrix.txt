        int res = 0;
        while (i >= 0 && j < n) {
            if (grid[i][j] < 0) {
                res += n - j;
                i--;
            } else
                j++;
        }
        return res;
    }
}