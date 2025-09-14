class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> scores = new ArrayDeque<>();
        int total = 0;

        for (String operation : operations) {
            switch (operation) {
                case "+" -> {
                    int top = scores.pop();
                    int newTop = top + scores.peek();
                    scores.push(top);
                    scores.push(newTop);
                    continue;
                }
                case "D" -> {
                    scores.push(scores.peek() * 2);
                    continue;
                }
                case "C" -> {
                    scores.pop();
                    continue;
                }
            }
            scores.push(Integer.valueOf(operation));
        }

        for (Integer score : scores) {
            total += score;
        }

        return total;
    }
}
