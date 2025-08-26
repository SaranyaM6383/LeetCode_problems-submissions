lass Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> counts=new HashMap<>();
        int res = -1, maxCount = 0;
        for(int n :nums){
            int newCount = counts.getOrDefault(n, 0) + 1;
            counts.put(n, newCount);
                if(newCount > maxCount){
                     maxCount = newCount;
                        res = n;
                }
        }
        return res;
    }
}
