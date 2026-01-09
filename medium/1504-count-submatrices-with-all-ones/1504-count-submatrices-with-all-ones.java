                sum[i] = h[i] * (i + 1);
            }
            st.push(i);
            res += sum[i];
        }
        return res;
    }
}