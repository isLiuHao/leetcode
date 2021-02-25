package leetcode;

public class demo033 {
    public int search(int[] nums, int target) {
        int  n=nums.length;
        if(n==0)return -1;
        if(n==1)return nums[0]==target?0:-1;
        int l=0,r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[l]<=nums[mid]){  //左侧有序
                if(nums[mid]>target&&nums[l]<=target){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }
            else{ //右侧有序
                if(nums[mid]<target&&nums[r]>=target){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}
