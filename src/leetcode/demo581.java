package leetcode;

import java.util.Arrays;

public class demo581 {
    public int findUnsortedSubarray(int[] nums) {
        int[] num1=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            num1[i]=nums[i];
        }
        Arrays.sort(num1);
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]==num1[i]){
                i++;
            }else break;
        }
        if(i==j)return 0;
        while(i<j){
            if(nums[j]==num1[j]){
                j--;
            }else break;
        }
        return j-i+1;
    }
}
