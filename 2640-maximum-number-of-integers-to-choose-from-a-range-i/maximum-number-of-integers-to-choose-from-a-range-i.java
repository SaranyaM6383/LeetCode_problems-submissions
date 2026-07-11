class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> s=new HashSet<>();
        for(int num:banned){
            s.add(num);
        }
        int sum=0;
        int count=0;
        for(int i=1;i<=n;i++){
            if(s.contains(i)){
                continue;
            }
            if(sum+i>maxSum){
                break;
            }
            sum+=i;
            count++;
        }
        return count;
    }
}