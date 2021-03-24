package leetcode;

import org.junit.Test;

public class demo152 {
    public int maxProduct(int[] nums) {
        int[] maxdp=new int[nums.length];
        int[] mindp=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            maxdp[i]=nums[i];
            mindp[i]=nums[i];
        }
        int max=maxdp[0];
        for(int i=1;i<nums.length;i++){
            maxdp[i]=Math.max(Math.max(maxdp[i-1]*nums[i],mindp[i-1]*nums[i]),maxdp[i]);
            mindp[i]=Math.min(Math.min(maxdp[i-1]*nums[i],mindp[i-1]*nums[i]),mindp[i]);
            max=Math.max(maxdp[i],max);
        }
        return max;
    }
    @Test
    public void test(){
        int[] a=new int[]{-2,3,-4};
        maxProduct(a);
    }
}
