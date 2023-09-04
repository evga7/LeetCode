class Solution {
    int []dp=new int [38];
    int N;
    public int go(int idx)
    {
        if (idx==0)
            return 0;
        if (idx==1 || idx==2)
            return 1;
        if (dp[idx]!=-1)
            return dp[idx];
        dp[idx]=0;
        if (idx-3>=0)
            dp[idx]+=go(idx-3)+go(idx-2)+go(idx-1);
        return dp[idx];
    }
    public int tribonacci(int n) {
        Arrays.fill(dp,-1);
        N=n;
        return go(n);
        
    }
}