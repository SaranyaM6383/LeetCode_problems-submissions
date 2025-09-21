    }
    
    public List<List<Integer>> report() {
        List<List<Integer>> ans=new ArrayList<>();
        for(Entry e:set){
            List<Integer> a=new ArrayList<>();
            a.add(e.s);
            a.add(e.m);
            ans.add(a);
            if(ans.size()==5) return ans;
        }
        return ans;
    }
}