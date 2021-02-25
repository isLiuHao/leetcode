package leetcode;

public class demo034 {
    public int[] searchRange(int[] nums, int target) {
        int len=nums.length;
        int[] res=new int[2];
        res[0]=-1;
        res[1]=-1;
        boolean flag=true;
        for(int i=0;i<len;i++){
            if(nums[i]==target){
                if(flag){           //第一次出现
                    res[0]=i;
                    res[1]=i;
                    flag=false;
                }
                else  res[1]=i;
            }
        }
        return res;
    }
}
