package leetcode;

public class demo055 {
    class Solution {
        public boolean canJump(int[] nums) {
            int len = nums.length;
            if(len==1)return true;
            if(nums[0]==0)return false;
            int i=0;
            while(i<len-1){
                int jumpi=nums[i]+i;//跳的最远下标
                if(jumpi>=len-1)return true;
                int x=i+1,jumpx=nums[x]+x;
                for(int j=i+1;j<=jumpi;j++){//选一个最远的
                    int jumpj=nums[j]+j;
                    if(jumpj>=jumpx){
                        jumpx=jumpj;
                        x=j;
                    }
                }
                if(jumpx>jumpi){
                    jumpi=jumpx;
                    i=x;
                }else if(nums[jumpi]==0){
                    return false;
                }
            }
            return true;
        }
    }
}
