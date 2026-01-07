        parent[i] = find(parent[i]);
        return parent[i];
    }
    public void unite(int i) {
        parent[i] = find(i + 1);
    }
}