            }
                count += subNum.get(total - k);    
            if (subNum.containsKey(total - k)) {
            total += n;
            subNum.put(total, subNum.getOrDefault(total, 0)+1);
        }
        return count;
    }
}