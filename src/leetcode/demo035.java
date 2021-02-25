package leetcode;

public class demo035 {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length-1;
        for(int i=0;i<=len;i++){
            if(nums[i]>=target)
                return i;
        }
        return len+1;
    }
}
