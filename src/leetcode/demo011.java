package leetcode;

public class demo011 {
    public int maxArea1(int[] height) {
        int res=0;
        int max=0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                res=(j-i)*(height[j]<height[i]?height[j]:height[i]);
                if(max<res)
                    max=res;
            }
        }
        return max;
    }

    public int maxArea(int[] height){
        int max=0;
        int start=0,end=height.length-1;
        while(start<end){
            int res=(end-start)*Math.min(height[start],height[end]);
            if(max<res){
                max=res;
            }
            if(height[start]<height[end])start++;
            else end--;
        }
        return max;
    }
}
