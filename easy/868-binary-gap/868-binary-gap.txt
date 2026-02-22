            if((n&1)==1){
                maxGap=Math.max(maxGap,gap);
            }
                gap=0;
            else
            gap++;
            n>>=1;
        }
    }
        return maxGap+1;
}