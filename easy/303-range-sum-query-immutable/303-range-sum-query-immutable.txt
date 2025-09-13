        }
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        for (int i = 1; i < n; i++) {
        prefixSum[0] = nums[0];
        prefixSum = new int[n];
        int n = nums.length;
    public NumArray(int[] nums) {
    private int[] prefixSum; 
class NumArray {
    }
    public int sumRange(int left, int right) {
        if (left == 0) {