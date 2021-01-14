package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo015 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]>0)return lists;
            if(i>0&&nums[i]==nums[i-1])continue;//去除重复解
            int j=i+1,k=nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);list.add(nums[j]);list.add(nums[k]);
                    lists.add(list);
                    while(j<k&&nums[j]==nums[j+1]) j++;//去除重复解
                    while(j<k&&nums[k]==nums[k-1]) k--;//去除重复解
                    j++;k--;
                }
                else if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }
                else j++;
            }
        }
        return lists;
    }
    @Test
    public  void main() {
        int[] nums={-4,-1,-1,0,1,2};
        List<List<Integer>> lists=new ArrayList<>();
        lists=threeSum(nums);
        System.out.println(lists);
    }
}
