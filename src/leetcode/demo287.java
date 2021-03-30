package leetcode;

public class demo287 {
    public int findDuplicate(int[] nums) {
        int fast = 0, slow = 0;
        while(true){
            fast=nums[fast];
            fast=nums[fast];
            slow=nums[slow];
            if(slow==fast)break;
        }
        slow=0;
        while(true){
            fast=nums[fast];
            slow=nums[slow];
            if(slow==fast)break;
        }
        return slow;
    }
}
