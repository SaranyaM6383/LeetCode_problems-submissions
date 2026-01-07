            for(int i=0;i<size-1;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }
        }
    }
        return nums[0];
}