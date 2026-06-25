          StringBuilder result = new StringBuilder();
                pq.addAll(freq.entrySet());
          while (!pq.isEmpty()) {
              Map.Entry<Character, Integer> entry = pq.poll();
                  result.append(String.valueOf(entry.getKey()).repeat(entry.getValue
                  ()));
                  }
    }
                  return result.toString();
}