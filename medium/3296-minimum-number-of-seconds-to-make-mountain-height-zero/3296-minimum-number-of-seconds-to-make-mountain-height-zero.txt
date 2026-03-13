                tot += (long) (Math.sqrt((double) mid / times[i] * 2 + 0.25) - 0.5);
            long tot = 0;
            for (int i = 0; i < times.length && tot < height; i++)
            long mid = (lo + hi) >> 1;
            if (tot >= height)
        while (lo < hi) {
    public long minNumberOfSeconds(int height, int[] times) {
        long lo = 1, hi = 10000000000000000L;
class Solution {