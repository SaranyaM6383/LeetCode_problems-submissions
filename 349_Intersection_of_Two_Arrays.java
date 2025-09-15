class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1set = new HashSet<>();
        Set<Integer> nums2set = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();

        for(int num : nums1){
            nums1set.add(num);
        }
        for(int num : nums2){
            nums2set.add(num);
        }
        for(int num : nums1set){
            if(nums2set.contains(num)){
                list1.add(num);
            }
        }
        int[] arr = new int[list1.size()];
        int i = 0;
        for(int num : list1){
            arr[i] = num;
            i++;
        }
        return arr;
    }
}
    
