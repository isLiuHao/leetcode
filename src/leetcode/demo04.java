package leetcode;

public class demo04 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int len3=len1+len2;
        int nums3[]=new int[len3];
        int k=0,i=0,j=0;
        while(i<len1&&j<len2){
            if(nums1[i]<=nums2[j]){
                nums3[k++]=nums1[i++];
            }
            else{
                nums3[k++]=nums2[j++];
            }
        }
        while(i<len1)nums3[k++]=nums1[i++];
        while(j<len2)nums3[k++]=nums2[j++];
        if(k%2==0)return (1.0*nums3[k/2-1]+1.0*nums3[k/2])/2;
        else return 1.0*nums3[k/2];
    }
}
