        long ans=Long.MAX_VALUE;
        for(int v:uniques){
            if(min1<v&&v<ans) ans=v;
        }
        return ans<Long.MAX_VALUE?(int) ans:-1;
    }
}