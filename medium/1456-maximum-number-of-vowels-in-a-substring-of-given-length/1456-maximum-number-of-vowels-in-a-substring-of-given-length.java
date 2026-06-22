        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))) curr++;
            if(isVowel(s.charAt(i-k))) curr--;
            maxVowels=Math.max(maxVowels,curr);
            if(maxVowels==k) return k;
        }
        return maxVowels;
    }
    private boolean isVowel(char c){
        return c=='a' || c=='e'|| c=='i' || c=='o' || c=='u';
    }
}