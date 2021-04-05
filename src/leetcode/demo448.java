package leetcode;

public class demo448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(x>=0){
                if(nums[x-1]>0){
                    nums[x-1]=nums[x-1]*(-1);
                }
            }
            else{
                x=x*(-1);
                if(nums[x-1]>0){
                    nums[x-1]=nums[x-1]*(-1);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0)
                res.add(i+1);
        }
        return res;
    }
}
