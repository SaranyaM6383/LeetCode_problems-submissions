    public boolean judgeCircle(String moves) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U')sum1++;
        }
    }
            else if(ch=='D')sum1--;
            else if(ch=='L')sum2++;
            else if(ch=='R')sum2--;
        if(sum1==0&&sum2==0)return true;
        return false;
}