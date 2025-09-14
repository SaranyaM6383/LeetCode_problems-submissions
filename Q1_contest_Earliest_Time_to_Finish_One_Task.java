class Solution {
    public int earliestTime(int[][] tasks) {
        if (tasks == null || tasks.length == 0) {
            return 0;
        }
        
        int earliest = Integer.MAX_VALUE;
        for (int i = 0; i < tasks.length; i++) {
            int start = tasks[i][0];
            int duration = tasks[i][1];
            int finish = start + duration;
            if (finish < earliest) {
                earliest = finish;
            }
        }
        return earliest;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[][] tasks1 = { {1, 6}, {2, 3} };
        int res1 = sol.earliestTime(tasks1);  
        
        int[][] tasks2 = { {100, 100}, {100, 100}, {100, 100} };
        int res2 = sol.earliestTime(tasks2);  
    }

}
  
    
