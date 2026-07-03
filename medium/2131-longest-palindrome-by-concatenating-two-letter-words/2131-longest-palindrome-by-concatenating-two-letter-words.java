       for(String key:map.keySet()){
        if(key.charAt(0)==key.charAt(1)&& map.get(key)>0){
            len+=2;
            break;
        }
       } 
            map.put(w,map.getOrDefault(w,0)+1);
        else{
            map.put(rev,map.get(rev)-1);
        }
        }
       }
       return len;
    }
}