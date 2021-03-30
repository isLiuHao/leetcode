package leetcode;

public class demo238 {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] l=new int[len];
        int[] r=new int[len];
        l[0]=1;
        for(int i=1;i<=len-1;i++){
            l[i]=l[i-1]*nums[i-1];
        }
        r[len-1]=1;
        for(int j=len-2;j>=0;j--){
            r[j]=r[j+1]*nums[j+1];
        }
        int[] res=new int[len];
        for(int i=0;i<len;i++){
            res[i]=l[i]*r[i];
        }
        return res;
    }
    public int[] productExceptSelf1(int[] nums) {
        int len=nums.length;
        int[] res=new int[len];
        res[0]=1;
        for(int i=1;i<=len-1;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        int R=1;
        for(int j=len-1;j>=0;j--){
            res[j]=res[j]*R;
            R=R*nums[j];
        }
        return res;
    }
}
