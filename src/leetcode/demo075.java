package leetcode;

public class demo075 {
    public void sortColors(int[] nums) {
        int l=0,r=nums.length-1;
        int i=0;
        while(i>=l&&i<=r){
            if(nums[i]==2){
                nums[i]=nums[r];
                nums[r]=2;
                r--;
            }else if(nums[i]==0){
                nums[i]=nums[l];
                nums[l]=0;
                l++;
                if(l>i)i=l;
            }else{
                i++;
            }

        }
    }
}
