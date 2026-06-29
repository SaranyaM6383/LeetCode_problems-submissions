        map.put(prefix,map.getOrDefault(prefix,0)+1);
        String prefix=word.substring(0,k);
               }
               int count =0;
               for(int value:map.values()){
                if(value>=2){
                    count++;
                }
               }
               return count;
    }
}
                
        if(word.length()<k) continue;
       HashMap<String,Integer> map=new HashMap<>();
       for(String word:words){
    public int prefixConnected(String[] words, int k) {