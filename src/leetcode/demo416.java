package leetcode;

public class demo416 {
    public boolean canPartition(int[] nums) {
        int len = nums.length;
        // 题目已经说非空数组，可以不做非空判断
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // 特判：如果是奇数，就不符合要求
        if (sum%2==1) {
            return false;
        }
        int target = sum / 2;
        // 创建二维状态数组，行：物品索引，列：容量（包括 0）
        boolean[][] dp = new boolean[len][target + 1];
        // 先填表格第 0 行，第 1 个数只能让容积为它自己的背包恰好装满
        if (nums[0] <= target) {
            dp[0][nums[0]] = true;
        }
        for(int i=1;i<len;i++){
            for(int j=0;j<=target;j++){
                if (nums[i] < j) {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i]];//不选与选
                }
                else if(nums[i] == j){  //自己就可以
                    dp[i][j] = true;
                }else
                    dp[i][j] = dp[i-1][j];//不选
            }
        }
        return dp[len-1][target];
    }
}
