package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo1262 {
    public int maxSumDivThree(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n];
        dp[0][0]=0;
        dp[0][1]=Integer.MIN_VALUE;
        dp[0][2]=Integer.MIN_VALUE;;
        for(int i=1;i<=n;i++){
            if(nums[i-1]%3==0){
                dp[i][0]=Math.max(dp[i-1][0],dp[i-1][0]+nums[i-1]);
                dp[i][1]=Math.max(dp[i-1][1],dp[i-1][1]+nums[i-1]);
                dp[i][2]=Math.max(dp[i-1][2],dp[i-1][2]+nums[i-1]);
            }
            else if(nums[i-1]%3==1){
                dp[i][0]=Math.max(dp[i-1][0],dp[i-1][2]+nums[i-1]);
                dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]+nums[i-1]);
                dp[i][2]=Math.max(dp[i-1][2],dp[i-1][1]+nums[i-1]);
            }
            else if(nums[i-1]%3==2){
                dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+nums[i-1]);
                dp[i][1]=Math.max(dp[i-1][1],dp[i-1][2]+nums[i-1]);
                dp[i][2]=Math.max(dp[i-1][2],dp[i-1][0]+nums[i-1]);
            }
        }
        return dp[n][0];
    }
    public int maxSumDivThree1(int[] nums) {
        int n=nums.length;
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]%3==1)list1.add(nums[i]);
            if(nums[i]%3==2)list2.add(nums[i]);
            max+=nums[i];
        }
        if(max%3==1){
            if(list2.size()>2&&list2.get(0)+list2.get(1)<list1.get(0)){
                max-=list2.get(0);
                max-=list2.get(1);
            }
            else{
                max-=list1.get(0);
                list1.remove(0);
            }
        }
        else if(max%3==2){
            if(list1.size()>2&&list1.get(0)+list1.get(1)<list2.get(0)){
                max-=list1.get(0);
                max-=list1.get(1);
            }
            else{
                max-=list2.get(0);
                list2.remove(0);
            }
        }
        return max%3==0?max:0;
    }
}
