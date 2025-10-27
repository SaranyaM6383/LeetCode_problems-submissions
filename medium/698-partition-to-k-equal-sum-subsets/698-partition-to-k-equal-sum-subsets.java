            }
            if(bucket[j]==0)
            break;
                 return true;
                 bucket[j]-=a[i];
                 if(canPartitionKSubsets(a,target,i-1,bucket))
                bucket[j]+=a[i];
        for(int j=0;j<bucket.length;j++){
            if(bucket[j]+a[i]<=target){
        return true;
    public boolean canPartitionKSubsets(int a[],int target,int i,int bucket[]){
        if(i==-1)
    }
        return canPartitionKSubsets(nums,sum/k,nums.length-1,new int[k]);
        Arrays.sort(nums);
        if(sum%k!=0 || nums.length<k) return false;