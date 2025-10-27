        }
        for(int i=0;i<nums.length;i++){
            if(left == right) return i;
            left+=nums[i];
            if(i+1<nums.length) right -= nums[i+1];
            else right=0;
        }
        return -1;
    }
}
        