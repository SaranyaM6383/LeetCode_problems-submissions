        for (int money : nums) {
            int curr = Math.max(
                    prev1,
                    prev2 + money);
        int prev2 = 0;
        int prev1 = 0;
    public int rob(int[] nums) {
class Solution {