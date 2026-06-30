            ans+=n-right;
        
        while(count[0] > 0 && count[1]>0 && count[2]>0){
            count[s.charAt(left)-'a']--; 
        
            count[s.charAt(right)-'a']++;
        for(int right=0;right<n;right++){
            left++;  
        }
        }
        int n=s.length();
        int ans=0;
        int left=0;