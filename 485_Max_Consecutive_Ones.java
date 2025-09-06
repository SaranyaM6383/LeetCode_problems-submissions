class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k=0;
        int max=0;for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                k++;
            }
            else{
                max=Math.max(max,k);
                k=0;
            }
        }
        max=Math.max(k,max);
        return max;
    }
}
