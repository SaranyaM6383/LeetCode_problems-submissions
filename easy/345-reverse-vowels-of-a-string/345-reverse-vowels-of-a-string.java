            char temp = word[start];
            word[start] = word[end];
                end--;
            }
            while (start < end && vowels.indexOf(word[end]) == -1) {
                start++;
            }
        String vowels = "aeiouAEIOU";
        while (start < end) {
            while (start < end && vowels.indexOf(word[start]) == -1) {
        int start = 0;
        int end = s.length() - 1;
        char[] word = s.toCharArray();
class Solution {
    public String reverseVowels(String s) {