        map.put(num, map.getOrDefault(num,0)+1);
      }  
      int max=0;
      for(int key:map.keySet()){
        if(map.containsKey(key+1)){
      for(int num:nums){
      HashMap<Integer,Integer> map=new HashMap<>();
    public int findLHS(int[] nums) {
            max=Math.max(max,map.get(key)+map.get(key+1));
        }