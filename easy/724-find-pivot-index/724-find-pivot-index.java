            int rightTotal=total-leftTotal-nums[i];
            if(rightTotal==leftTotal){
                return i;
            }
            leftTotal += nums[i];
        }
        return -1;
    }
}
         
        for(int i=0;i<nums.length;i++){