class Solution {
    int dp[]=new int[1002];
    public int go(int idx,int[] cost)
    {
        if (idx>=cost.length)
            return 0;
        if (dp[idx]!=-1)
            return dp[idx];
        dp[idx]=987654321;
        dp[idx]=Math.min(dp[idx],Math.min(go(idx+1,cost),go(idx+2,cost)))+cost[idx];
        return dp[idx];
    }
    public int minCostClimbingStairs(int[] cost) {
        Arrays.fill(dp,-1);
        return Math.min(go(0,cost),go(1,cost));
        
    }
}