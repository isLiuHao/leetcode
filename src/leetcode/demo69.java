package leetcode;

public class demo69 {
    public int mySqrt(int x) {
        int low=0,high=x/2+1,ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if((long)mid*mid<=x){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}
