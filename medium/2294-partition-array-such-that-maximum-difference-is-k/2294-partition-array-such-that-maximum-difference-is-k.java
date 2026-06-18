        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]-min>k){
                ans++;
                min=nums[i];
        }
    }
    return ans;
}
}