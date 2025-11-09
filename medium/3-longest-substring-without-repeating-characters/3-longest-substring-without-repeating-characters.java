        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();
        int left = 0;
    public int lengthOfLongestSubstring(String s) {
class Solution {
            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }