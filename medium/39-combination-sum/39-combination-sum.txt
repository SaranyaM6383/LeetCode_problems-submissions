        comb.add(candidates[idx]);
        makeCombination(candidates, target, idx, comb, total + candidates[idx], 
res);
        comb.remove(comb.size() - 1);
        makeCombination(candidates, target, idx + 1, comb, total, res);
    }    
}