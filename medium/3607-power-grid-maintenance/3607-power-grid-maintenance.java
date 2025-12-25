                    continue;
                }
                int par = findParent(node);
                PriorityQueue<Integer> pq = mp.get(par);
                while (!pq.isEmpty() && offline[pq.peek()]) pq.poll();
                ans.add(pq.isEmpty() ? -1 : pq.peek() + 1);
            } else {
                offline[node] = true;
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}