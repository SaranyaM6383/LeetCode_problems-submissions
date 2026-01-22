    private boolean isSorted(List <Integer> v) {
        for(int i = 0; i < v.size() - 1; i ++){
            if(v.get(i) > v.get(i + 1)) return false;
        }
        return true;
    }
}