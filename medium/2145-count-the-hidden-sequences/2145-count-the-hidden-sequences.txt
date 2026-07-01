    public int numberOfArrays(int[] differences, int lower, int upper) {
        long sum=0;
        long max=0;
        long min=0;
        for(int num:differences){
            sum+=num;
        }
            max=Math.max(max,sum);
            min=Math.min(min,sum);
        return (int) Math.max(0,upper-lower-max+min+1);
            }
}