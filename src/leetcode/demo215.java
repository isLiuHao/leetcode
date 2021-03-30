package leetcode;

public class demo215 {
    public int findKthLargest(int[] nums, int k) {
        for(int i=nums.length-1,j=0;i>=0;i--){
            buildMaxHeap(nums,i);
            int temp=nums[0];
            nums[0]=nums[i];
            nums[i]=temp;
            j++;
            if(j==k)return temp;
        }
        return 0;
    }
    //建堆
    public void buildMaxHeap(int[] nums,int tail) {
        for (int i = tail / 2; i >= 0; i--) {
            maxHeapify(nums,i,tail);//调整
        }
    }
    //调整堆
    public void maxHeapify(int[] nums,int x,int tail){
        int temp=nums[x];
        int i=x;
        while(i<=tail){
            int j=i*2+1;
            if(j+1<=tail&&nums[j+1]>nums[j])
                j++;//选大的节点
            if(j<=tail&&nums[j]>nums[i]){
                nums[i]=nums[j];
                i=j;
            }
            else break;
        }
        nums[i]=temp;
    }
}
