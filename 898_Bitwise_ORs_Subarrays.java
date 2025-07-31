import java.util.*;
class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> cur = new HashSet<>();
        for(int num : arr){
            Set<Integer> s1 = new HashSet<>();
            s1.add(num);        
        for(int x : cur){
            s1.add(x | num);
        }
        cur=s1;
        res.addAll(cur);
    }
    return res.size();
    }
}
