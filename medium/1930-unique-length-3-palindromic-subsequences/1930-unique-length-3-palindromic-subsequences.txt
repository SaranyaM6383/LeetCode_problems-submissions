            int L=first[c];
           int res=0;
           for(int c=0;c<26;c++){
           }
            first[c] =Math.min(first[c],i);
            last[c]=i;
        for(int i=0;i<n;i++){
            int c=s.charAt(i)-'a';
            int R=last[c];
            if(R-L<2) continue;
            boolean[] memo=new boolean[26];
            for(int i=L+1;i<R;i++){
                int idx=s.charAt(i)-'a';
        Arrays.fill(last,-1);
                if(!memo[idx]){