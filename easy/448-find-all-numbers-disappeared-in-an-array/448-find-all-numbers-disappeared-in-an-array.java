        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
            set.add(num);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
    public List<Integer> findDisappearedNumbers(int[] nums) {
class Solution {