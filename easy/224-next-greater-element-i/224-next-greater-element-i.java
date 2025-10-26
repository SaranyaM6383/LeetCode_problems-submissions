        st.push(num);
       }
       int[] res=new int[nums1.length];
       for(int i = 0;i < nums1.length; i++) {
        res[i] = ng.getOrDefault(nums1[i], -1);
       }
       return res;
    }
}
       
        }
            ng.put(st.pop() ,num);
        while(!st.isEmpty() && st.peek() <num) {
       for(int num:nums2){
       Deque<Integer> st=new ArrayDeque<>();