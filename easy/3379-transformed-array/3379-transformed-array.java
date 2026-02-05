        A[i]+=OFFSET;
        for(int i=0;i<n;i++)
        int MASK =(1<<8)-1;
        for(int i=0;i<n;i++){
            int curr=A[i]-OFFSET;
            int idx=((i+curr)%n+n)%n;
            int val=A[idx]&MASK;