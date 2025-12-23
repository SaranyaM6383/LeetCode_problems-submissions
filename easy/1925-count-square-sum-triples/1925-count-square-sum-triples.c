                int c = u * u + v * v;
                if (c > n) continue;
                res += (n / c) << 1;
            }
        }
        return res;
    }
    int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}