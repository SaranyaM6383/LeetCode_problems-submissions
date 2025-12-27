        }
        for(int j=1;j<n-1;j++) {
            leftMap.put(nums[j-1], leftMap.getOrDefault(nums[j-1],0) + 1);
            rightMap.put(nums[j], rightMap.getOrDefault(nums[j],0) - 1);
            if(rightMap.get(nums[j])==0)
                rightMap.remove(nums[j]);
            int target = 2*nums[j];
            if(leftMap.containsKey(target) && rightMap.containsKey(target)) {
                ans += ((long)leftMap.get(target)*rightMap.get(target));
            }
        }
        return (int)(ans%1000000007);
    }
}