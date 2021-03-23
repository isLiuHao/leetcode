package leetcode;

import java.util.List;

public class demo139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];//dp[i]前i个字符
        dp[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&wordDict.contains(s.substring(j,i))){//dp[j]&&check[j...i-1],substring左闭右开
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
