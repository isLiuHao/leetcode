package leetcode;

public class demo045 {
    public int jump(int[] nums) {
        int len=nums.length;
        if(len==1)return 0;
        int step=0,maxIndex=0,end=0;
        for(int i=0;i<len-1;i++){
            maxIndex=Math.max(maxIndex,nums[i]+i);
            if(i==end){
                end=maxIndex;
                step++;
            }
        }
        return step;
    }
}
