import java.util.*;
class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> freq=new ArrayList<>(map.values());
        Collections.sort(freq,Collections.reverseOrder());
        int removed=0;
        int count=0;
        int half=arr.length/2;
        for(int f:freq){
            removed+=f;
            count++;
            if(removed>=half){
                return count;
            }
        }
        return count;
    }
}
        