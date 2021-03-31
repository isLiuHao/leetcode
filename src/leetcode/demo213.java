package leetcode;

public class demo213 {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        if(n==1)return nums[0];
        if(n==2)return Math.max(nums[0],nums[1]);
        int dp[]=new int[n];
        //偷0到n-2
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<=n-2;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        int res=dp[n-2];
        //偷1到n-1
        dp[1]=nums[1];
        dp[2]=Math.max(nums[1],nums[2]);
        for(int i=3;i<=n-1;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return Math.max(dp[n-1],res);
    }
}
