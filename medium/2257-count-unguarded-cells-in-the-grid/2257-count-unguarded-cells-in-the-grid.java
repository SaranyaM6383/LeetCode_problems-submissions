            int r = g[0], c = g[1];
            dfs(r, c + 1, "r", vis, mp);
            dfs(r, c - 1, "l", vis, mp);
            dfs(r + 1, c, "d", vis, mp);
            dfs(r - 1, c, "u", vis, mp);
        }
        int cnt = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (vis[i][j] == 0) cnt++;
        return cnt;
    }
}