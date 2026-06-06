            rightSum+=num;
        }
        int leftSum=0;
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            rightSum-=nums[i];
            result[i]=Math.abs(leftSum-rightSum);
            leftSum+=nums[i];
        }
        return result;
    }