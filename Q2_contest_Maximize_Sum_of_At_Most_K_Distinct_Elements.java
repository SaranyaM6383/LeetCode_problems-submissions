import java.util.*;

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        
        int[] praxolimor = Arrays.copyOf(nums, nums.length);
        
        
        Set<Integer> distinct = new HashSet<>();
        for (int x : praxolimor) {
            distinct.add(x);
        }
        
        
        List<Integer> list = new ArrayList<>(distinct);
        Collections.sort(list, Collections.reverseOrder());
        
        
        int size = Math.min(k, list.size());
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
    

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums1 = {84, 93, 100, 77, 90};
        int[] res1 = sol.maxKDistinct(nums1, 3);  
        
        int[] nums2 = {84, 93, 100, 77, 93};
        int[] res2 = sol.maxKDistinct(nums2, 3);  
        int[] nums3 = {1,1,1,2,2,2};
        int[] res3 = sol.maxKDistinct(nums3, 6);  
        
      
    }
}

