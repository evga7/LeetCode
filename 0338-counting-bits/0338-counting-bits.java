class Solution {
    int []dp=new int[1000001];
    public int go(int idx)
    {
        if (idx==0)
            return 0;
        if (dp[idx]!=-1)
            return dp[idx];
        dp[idx]=0;
        if (idx%2==0)
            dp[idx]+=go(idx/2);
        else
            dp[idx]+=go(idx-1)+1;
        return dp[idx];
    }
    public int[] countBits(int n) {
        int []res=new int [n+1];
        Arrays.fill(dp,-1);
        for (int i=0;i<=n;i++)
            res[i]=(go(i));
        return res;
        
    }
}