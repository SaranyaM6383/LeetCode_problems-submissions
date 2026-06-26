            int freq=hm.getOrDefault(senders[i],0)+words.length;
            hm.put(senders[i],freq);
            if(hm.get(senders[i])>max){
                max=hm.get(senders[i]);
                name=senders[i];
            }
            else if(hm.get(senders[i])==max && name.compareTo(senders[i])<0){
        for(int i=0;i<senders.length;i++){
            String[] words=messages[i].split(" ");
        String name="";
        int max=0;
        HashMap<String,Integer> hm=new HashMap<>();