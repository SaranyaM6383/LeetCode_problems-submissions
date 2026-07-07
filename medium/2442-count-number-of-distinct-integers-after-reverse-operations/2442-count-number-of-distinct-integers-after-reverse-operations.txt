            s.add(num);
        
             int temp=num;
             int rev=0;
              while(temp>0){
                rev=rev*10+temp%10;
                temp/=10;
              }
              s.add(rev);
        }
        return s.size();
    }
}
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int num:nums){