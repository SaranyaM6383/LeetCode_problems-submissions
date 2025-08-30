class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() <26) return false;
        for(char ch='a';ch<='z';ch++) {
            if(sentence.indexOf(ch)<0){
                return false;
            }
        }    
        return true;
    }
}
1832_Check_if_the_Sentence_Is_Pangram.java
