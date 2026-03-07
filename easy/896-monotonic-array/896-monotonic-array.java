            if(nums[i]>nums[i-1]){
                isDec=false;
            }
        }
        return isInc || isDec;
    }
}