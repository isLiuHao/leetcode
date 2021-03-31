package leetcode;

public class demo338 {
    public int[] countBits(int num) {
        int[] res=new int[num+1];
        for(int i=0;i<=num;i++){
            res[i]=countOnes(i);
        }
        return res;
    }
    public int countOnes(int x) {
        int ones = 0;
        while (x>0) {
            //该运算将 x 的二进制表示的最后一个 1 变成 0
            x=x&(x-1);
            ones++;
        }
        return ones;
    }

    public int[] countBits1(int num) {
        int[] dp=new int[num+1];
        dp[0]=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){//偶数
                dp[i]=dp[i/2];
            }else{//奇数
                dp[i]=dp[i-1]+1;
            }
        }
        return dp;
    }

}
