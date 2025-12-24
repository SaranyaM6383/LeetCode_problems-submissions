        }
        int res = 0;
        for (int i = high; i >= low && sum > 0; i--) {
            while (fq[i]-- > 0 && sum > 0) {
                sum -= i;
                res++;
            }
        }
        return res;
    }
}