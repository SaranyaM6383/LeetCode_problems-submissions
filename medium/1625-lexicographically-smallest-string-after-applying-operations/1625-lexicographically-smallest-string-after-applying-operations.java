            StringBuilder sb = new StringBuilder(cur);
            for (int i = 1; i < sb.length(); i += 2)
                sb.setCharAt(i, (char) ((sb.charAt(i) - '0' + a) % 10 + '0'));
            String added = sb.toString();
            if (vis.add(added)) q.offer(added);
            String rotated = cur.substring(cur.length() - b) + cur.substring(0, cur.length
() - b);
            if (vis.add(rotated)) q.offer(rotated);
        }
        return smallest;
    }
}