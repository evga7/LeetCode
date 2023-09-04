class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap();
        for (int cur : nums)
        {
            m.put(cur,m.getOrDefault(cur,0)+1);
        }
        for (int cur : m.keySet())
            if (m.get(cur)==1)
                return cur;
        return -1;
    }
}