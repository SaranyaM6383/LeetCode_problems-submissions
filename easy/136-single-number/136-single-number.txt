class Solution {
    public int singleNumber(int[] nums) {
       return java.util.Arrays.stream(nums).reduce(0,(a,b)-> a^b); 
    }
}