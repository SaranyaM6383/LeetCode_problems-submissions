    }
    private int binarySearch(List<Integer> keys, int end, int value) {
        int l = 0, r = end, ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (keys.get(mid) <= value) {
                ans = mid;
                l = mid + 1;
            } else r = mid - 1;
        }
        return ans;
    }
}