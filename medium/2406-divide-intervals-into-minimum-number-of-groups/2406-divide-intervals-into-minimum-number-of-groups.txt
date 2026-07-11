    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
            PriorityQueue<Integer> q=new PriorityQueue<>();
            for(int[] interval:intervals){
                int start=interval[0];
                int end=interval[1];
                if(!q.isEmpty() && q.peek()<start){
                    q.poll();
                }
                q.offer(end);
            }
            return q.size();
        }
    
}