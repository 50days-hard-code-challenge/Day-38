class Solution {
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        for(int i=0;i<dp.length;i++)
        {
            dp[i]=-1;
        }
        return helper(n,dp);
        
    }
    public int helper(int n, int dp[])
    {
        if(n==0)
        {
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++)
        {
            int currsum;
            if(dp[n-(i*i)]==-1)
            {
                currsum=helper( n-(i*i),  dp);
                dp[n-(i*i)]=currsum;
            }
            else
            {
                currsum= dp[n-(i*i)];
            }
            if(min>currsum)
            {
                min=currsum;
            }
        }
        int ans=1+min;
        return ans;

    }
}
