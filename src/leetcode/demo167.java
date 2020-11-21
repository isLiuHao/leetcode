package leetcode;

public class demo167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] nums=new int[2];
        int n=numbers.length;
        for(int i=0,j=n-1;i<j;){
            if((numbers[i]+numbers[j])==target){
                nums[0]=i+1;
                nums[1]=j+1;
                break;
            }else if((numbers[i]+numbers[j])<target){
                i++;
            }else j--;
        }
        return nums;
    }
}
