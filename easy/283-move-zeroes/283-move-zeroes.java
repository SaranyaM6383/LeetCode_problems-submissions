            left++;
        }
            nums[left]=temp;
            int temp=nums[right];
            nums[right]=nums[left];
        if(nums[right]!=0){
       for(int right=0;right<nums.length;right++){
       int left=0;
class Solution {
    public void moveZeroes(int[] nums) {