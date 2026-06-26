            countS[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            countT[ch-'a']++;
        }
        int steps=0;
        for(int i=0;i<26;i++){
            steps+=Math.abs(countS[i]-countT[i]);
        }
        return steps/2;
    }
}