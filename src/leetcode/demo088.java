package leetcode;

public class demo088 {

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[k++];
        }
        for(int i=m+n-1;i>0;i--){
            if(nums1[i]<nums1[i-1]){
                int x=nums1[i];
                nums1[i]=nums1[i-1];
                nums1[i-1]=x;
            }
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=m+n-1;
        int p1=m-1;
        int p2=n-1;
        while(p>=0){
            if(nums1[p1]>=nums2[p2]){
                nums1[p--]=nums1[p1--];
            }else{
                nums1[p--]=nums2[p2--];
            }
        }
    }
}
