package leetcode;

public class demo343 {
    public int cuttingRope1(int n) {
        if(n==2)return 1;
        if(n==3)return 2;
        int a=n/3;
        int b=n%3;
        if(b==0) return (int)Math.pow(3,a);
        else if(b==2)return 2*(int)Math.pow(3,a);
        else return 2*2*(int)Math.pow(3,a-1);
    }
    public int cuttingRope(int n) {
        int[] dp=new int[n+1];
        dp[2]=1;
        for(int i=3;i<=n;i++){
            for(int j=2;j<i;j++){
                dp[i]=Math.max(dp[i-j]*j,j*(i-j));
            }
        }
        return dp[n];
    }
    public int cuttingRope2(int n) {
        if(n==2)return 1;
        if(n==3)return 2;
        if(n==4)return 4;
        long res = 1;
        while(n>4){
            res  = res * 3 % 1000000007;
            n -= 3;
        }
        return (int) (res * n % 1000000007);
    }

}
