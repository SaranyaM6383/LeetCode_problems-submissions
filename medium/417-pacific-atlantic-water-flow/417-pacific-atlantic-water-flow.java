     ·‌·‌·‌·‌·‌·‌·‌pacific[i][0]·‌=·‌true;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌atlantic[i][n·‌-·‌1]·‌=·‌true;
·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int·‌j·‌=·‌0;·‌j·‌<·‌n;·‌j++)·‌{
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌pacific[0][j]·‌=·‌true;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌atlantic[m·‌-·‌1][j]·‌=·‌true;
·‌·‌·‌·‌·‌·‌·‌·‌}
        boolean updated = true;
        while (updated) {
            updated = false;
            for (int i = 0; i < m; i++) {