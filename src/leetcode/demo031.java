package leetcode;

import java.util.Arrays;

public class demo031 {
    public void nextPermutation(int[] nums) {
        int len=nums.length;
        int  i=len-2,j=len-1;
        while(i>=0&&nums[i]>=nums[i+1]){//找到第一个不是降序的数字
            i--;
        }
        if(i>=0){
            for(;j>i;j--){
                if(nums[j]>nums[i]) {//与比他稍微大一点的交换
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    break;
                }
            }
            //升序排列后面
            Arrays.sort(nums,i+1,len);
        }
        else
            Arrays.sort(nums);
    }
}
