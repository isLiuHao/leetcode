package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo016 {
    public int threeSumClosest(int[] nums, int target) {
        int len=nums.length;
        int min=Integer.MAX_VALUE;
        int absMin=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<len;i++){
            int j=i+1,k=len-1;
            while(j<k){
                int absDiff=Math.abs(nums[i]+nums[j]+nums[k]-target);
                int sum=nums[i]+nums[j]+nums[k];
                if(sum-target<0)j++;
                else k--;
                if(absMin>absDiff){
                    absMin=absDiff;
                    min=sum;
                }
            }

        }
        return min;
    }
    @Test
    public  void main() {
        int[] nums={-1,0,1,1,55};
        int a=threeSumClosest(nums,3);
        System.out.println(a);
    }
}
