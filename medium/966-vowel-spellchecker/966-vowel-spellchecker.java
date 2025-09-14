            if (vowelMap.containsKey(qMasked)) {
                ans[i] = vowelMap.get(qMasked);
            } else {
                ans[i] = "";
            }
        }
        return ans;
    }
}