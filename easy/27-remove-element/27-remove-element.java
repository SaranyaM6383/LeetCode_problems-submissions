        for(int i=0;i<nums.length;i++){
            if(nums[i] !=val){
                nums[k]=nums[i];
            }
        }
                k++;
    }
        return k;
}