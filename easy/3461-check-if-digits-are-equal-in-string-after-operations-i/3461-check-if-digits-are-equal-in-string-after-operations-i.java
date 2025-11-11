        a = n;
        b = i;
        while (a > 0 || b > 0) {
            int na = a % 5;
            int nb = b % 5;
            mod5 = (mod5 * fast5[na][nb]) % 5;
            a /= 5;
            b /= 5;
        }
        return xunzhi[mod2][mod5];
    }
}