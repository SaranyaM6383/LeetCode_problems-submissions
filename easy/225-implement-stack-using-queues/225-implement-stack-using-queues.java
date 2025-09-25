    public MyStack() {
        q = new LinkedList<>();
    }
    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.poll());
        }
    }
    public int pop() {
        return q.poll();
    }