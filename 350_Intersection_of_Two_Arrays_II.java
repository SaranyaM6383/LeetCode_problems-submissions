class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0,j=0;
        List<Integer> li = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums2[j] > nums1[i])i++;
            else if(nums2[j] < nums1[i])j++;
            else{
                li.add(nums1[i]);
                i++;j++;
            }
        }

        return li.stream().mapToInt(Integer::intValue).toArray();
    }
}
    
