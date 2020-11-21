package leetcode;

public class demo27 {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[k])
                nums[++k]=nums[i];
        }
        return k+1;
    }
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val)
                nums[k]=nums[i];k++;
        }
        return k;
    }
}
