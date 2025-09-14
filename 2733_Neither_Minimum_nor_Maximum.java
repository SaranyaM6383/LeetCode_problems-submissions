class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int min =nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]> min&& nums[i]<max){
                return nums[i];
            }
        }
        return -1;
    }
}
        
