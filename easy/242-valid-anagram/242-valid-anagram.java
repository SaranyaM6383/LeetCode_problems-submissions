class Solution {
    public boolean isAnagram(String s, String t) {
        return Arrays.equals(s.chars().sorted().toArray(),t.chars().sorted().toArray
    }
());
}