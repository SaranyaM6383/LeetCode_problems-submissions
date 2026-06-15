            if(s.charAt(i)=='1' ) cost++;
        }
            ans=Math.min(ans,cost);
        }
           return ans;
        
    }
        for(int i=1;i<n-1;i++){
            if(s.charAt(n-1) == '0') cost++;
        
            if(s.charAt(0)=='0') cost++;