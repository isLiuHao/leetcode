package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length<4)return res;
        for(int a=0;a<nums.length-3;a++){
            if(a>0&&nums[a]==nums[a-1])continue;//去重
            for(int b=a+1;b<nums.length-2;b++){
                if(b>a+1&&nums[b]==nums[b-1])continue;//去重
                int c=b+1,d=nums.length-1;
                while(c<d){
                    if(nums[a]+nums[b]+nums[c]+nums[d]==target){
                        List<Integer> lists=new ArrayList<>();
                        lists.add(nums[a]);lists.add(nums[b]);lists.add(nums[c]);lists.add(nums[d]);
                        res.add(lists);
                        while(c<d&&nums[c]==nums[c+1])c++;//去重
                        while(c<d&&nums[d]==nums[d-1])d--;//去重
                        c++;d--;
                    }
                    else if(nums[a]+nums[b]+nums[c]+nums[d]<target)c++;
                    else d--;
                }
            }
        }
        return res;
    }
    @Test
    public  void main() {
        int[] nums={-2,-1,-1,1,1,2,2};
        List<List<Integer>> lists=new ArrayList<>();
        lists=fourSum(nums,0);
        System.out.println(lists);
    }
}
