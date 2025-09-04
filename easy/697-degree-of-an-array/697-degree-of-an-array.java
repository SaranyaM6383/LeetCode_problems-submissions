        }
        int minLength = nums.length;
        for(int n: cnt.keySet()){
            if(cnt.get(n) == degree){
                int len = last.get(n) - first.get(n) + 1;
                minLength = Math.min(minLength, len);
            }
        } 
        return minLength;
    }
}
            degree = Math.max(degree, cnt.get(n));
            cnt.put(n, cnt.getOrDefault(n, 0) + 1);