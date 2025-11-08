        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        if (count1 > n / 3) {
            res.add(majority1);
        }
        if (count2 > n / 3) {
            res.add(majority2);
        }
        return res;        
    }
}