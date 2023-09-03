class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> m= new HashMap();
        for (int cur : arr)
        {
            if (!m.containsKey(cur))
                m.put(cur,1);
            else
                m.put(cur,m.get(cur)+1);
        }
        HashSet<Integer> st=new HashSet();
        for (int cur : m.values())
        {
            if (st.contains(cur))
                return false;
            st.add(cur);
        }

        return true;
        
    }
}