        if (map[a][b] == null) return;
        
        for (char c : map[a][b]) {
            current[idx] = c;
            getNextRows(row, map, idx + 1, current, result);
        }
    }
}