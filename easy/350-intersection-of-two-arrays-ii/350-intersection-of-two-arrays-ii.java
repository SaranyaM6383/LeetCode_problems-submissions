            else if(nums2[j] < nums1[i])j++;
            else{
                li.add(nums1[i]);
                i++;j++;
            }
            if(nums2[j] > nums1[i])i++;
        while(i<nums1.length && j<nums2.length){
        List<Integer> li = new ArrayList<>();
        int i=0,j=0;
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {