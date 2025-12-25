        for (int i = 0; i < nums.length; i++) {
            prefix = (prefix + nums[i]) % p;
            int need = (int)((prefix - target + p) % p);
            if (mMap.containsKey(need)) {
                res = Math.min(res, i - mMap.get(need));
            }
            mMap.put((int)prefix, i);
        }
        return res == nums.length ? -1 : res;
    }
}