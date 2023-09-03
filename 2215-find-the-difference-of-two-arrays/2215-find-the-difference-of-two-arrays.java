class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> st=new HashSet<>();
        Set<Integer> st2=new HashSet<>();
        for (int cur :nums1)
            st.add(cur);
        for (int cur :nums2)
            st2.add(cur);
        List<List<Integer>> res= new ArrayList<>();
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());
        for (int cur :st)
            if (!st2.contains(cur))
                res.get(0).add(cur);
        for (int cur :st2)
            if (!st.contains(cur))
                res.get(1).add(cur);
        return res;
    }
}