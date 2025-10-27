            sum += nums[i];
        }
        
        maxSum = sum;
        //now loop over the remaining array ,using this window calculate sum and compare 
with maxSum
        for(int i=k;i<nums.length;i++){
            sum = sum - nums[i-k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}