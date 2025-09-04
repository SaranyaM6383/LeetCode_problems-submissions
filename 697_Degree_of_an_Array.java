class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();

        int degree = 0;

        for(int i = 0; i < nums.length; i++){
            int  n = nums[i];
            if(!first.containsKey(n)){
                first.put(n, i);
            }
            last.put(n, i);

            cnt.put(n, cnt.getOrDefault(n, 0) + 1);
            degree = Math.max(degree, cnt.get(n));
        }
        int minLength = nums.length;
        for(int n: cnt.keySet()){
            if(cnt.get(n) == degree){
                int len = last.get(n) - first.get(n) + 1;
                minLength = Math.min(minLength, len);
            }
        }
        return minLength;
    }
      }
