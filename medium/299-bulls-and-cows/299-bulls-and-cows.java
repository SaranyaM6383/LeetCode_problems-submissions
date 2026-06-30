       int gFreq[]=new int[10];
       for(int i=0;i<secret.length();i++){
        char s=secret.charAt(i);
        char g=guess.charAt(i);
        if(s==g){
            bulls++;
        }
        else{
            sFreq[s-'0']++;
            gFreq[g-'0']++;
        }
       }
       for(int i=0;i<10;i++){
        cows+=Math.min(sFreq[i],gFreq[i]);
       }
    