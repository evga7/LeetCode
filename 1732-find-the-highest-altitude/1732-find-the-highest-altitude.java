class Solution {
    public int largestAltitude(int[] gain) {
        int res=0;
        int s=0;
        for (int cur : gain)
        {
            s+=cur;
            res=Math.max(res,s);
        }
        return res;
    }
}