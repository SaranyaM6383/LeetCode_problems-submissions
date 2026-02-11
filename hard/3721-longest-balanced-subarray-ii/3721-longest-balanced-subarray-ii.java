            int sign = (x % 2 == 1) ? 1 : -1;
            int L = l, R = nextPos - 1;
            if (L <= R) st.addRange(L, R, -sign);
        }
        return ans;
    }
}