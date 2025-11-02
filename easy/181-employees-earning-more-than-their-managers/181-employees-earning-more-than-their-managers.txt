       while(l<=h){
        int mid=l+(h-l)/2;
       
        if(isBadVersion(mid)) h=mid-1;
        else l=mid+1;
       }
       return l;
    }
}
       int l=0,h=n;
    public int firstBadVersion(int n) {