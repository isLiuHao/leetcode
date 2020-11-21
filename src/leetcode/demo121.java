package leetcode;

public class demo121 {
    public int maxProfit(int[] prices) {
        int[] dp=new int[prices.length+1];
        int minprice=prices[0];
        if(prices.length==0)return 0;
        dp[0]=0;
        for(int i=1;i<prices.length;i++){
            minprice=Math.min(prices[i],minprice);
            dp[i]=Math.max(dp[i-1],prices[i]-minprice);
        }
        return dp[prices.length-1];
    }
    public int maxProfit1(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for(int i=1;i<n;i++){
            dp[i][0]=Math.max(dp[i-1][0],prices[i]+dp[i-1][1]);
            dp[i][1]=Math.max(dp[i-1][1],-prices[i]);
        }
        return Math.max(dp[n-1][0],dp[n-1][1]);
    }
}
