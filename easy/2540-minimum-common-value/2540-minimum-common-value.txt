            }
        }
        return -1;
    }
}
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(int num : nums2){
            if(mp.containsKey(num) && mp.get(num)>0){
                return num;