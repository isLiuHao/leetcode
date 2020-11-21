package leetcode;

import java.util.Arrays;

public class demo169 {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int x=nums[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]==x)count++;
            else {
                count--;
                if(count==0){
                    x=nums[i];
                    count=1;
                }
            }
        }
        return x;
    }
}
