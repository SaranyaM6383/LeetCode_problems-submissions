            .filter(i -> words[i].equals(target))
                .map(i -> Math.min(Math.abs(i - startIndex), words.length - Math.abs
(i - startIndex)))
                    .min().orElse(-1);
    }
}
        return java.util.stream.IntStream.range(0, words.length)
class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {