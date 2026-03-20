                                                    List<Integer> v = new 
ArrayList<>();
                                                                    for (int x = i; 
                                    for (int j = 0; j <= n - k; j++) {
class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
                int[][] ans = new int[m - k + 1][n - k + 1];
                        for (int i = 0; i <= m - k; i++) {