            for(int j=0;j<n;j++)
            dev+=(row.charAt(j)=='1'?1:0);
            if(dev>0){
                ans+=dev*prev;
                prev=dev;
            }
        }
        return ans;
    }
}
         