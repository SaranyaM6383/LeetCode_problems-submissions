        for(int num:nums){
            streak=(num==0) ? streak+1:0;
            cnt+=streak;
        }
        return cnt;
    }
}