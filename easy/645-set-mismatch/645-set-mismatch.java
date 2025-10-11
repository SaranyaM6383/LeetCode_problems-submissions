        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
          max=Math.max(max,nums[i]);
        }
        for(int i=1;i<max;i++){
          if(!set.contains(i)){
            arr[1]=i;
            break;
          }
        }
        if(arr[1]==0)arr[1]=max+1;
        return arr;
    }
}