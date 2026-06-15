class Solution {
    public long minOperations(int[] nums) {
        long count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count += nums[i]-nums[i+1];
            }
        }
    }
        return count;
}