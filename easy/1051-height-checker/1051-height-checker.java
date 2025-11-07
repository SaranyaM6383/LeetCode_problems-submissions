        int[] expect=new int[heights.length];
        for(int i=0;i<expect.length;i++){
            expect[i]=heights[i];
        }
        Arrays.sort(expect);
        for(int i=0;i<expect.length;i++){
            if(expect[i]!=heights[i]){
        }
                res++;
            }
    }
        return res;
}