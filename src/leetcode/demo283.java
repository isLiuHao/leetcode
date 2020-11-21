package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class demo283 {
    @Test
    public void test(){
        int[] nums={1,5,0,0,2,8};
        moveZeroes(nums);
    }
    public void moveZeroes(int[] nums) {
       int j=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               int tem=nums[i];
               nums[i]=nums[j];
               nums[j]=tem;
               j++;
           }
       }
    }
}
