                                                        ans.remove(ans.size() - 1);
                                                                        curr *= 2;
                                                                                    }
                                                                                      
          ans.add(curr);
                for (int i = 0; i < nums.length; i++) {
                            long curr = nums[i];
                                        while (ans.size() > 0 && ans.get(ans.size() - 
                                        1) == curr) {
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        java.util.List<Long> ans = new java.util.ArrayList<>();