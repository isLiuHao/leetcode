package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class demo078 {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        back(nums,0);
        return res;
    }
    public void back(int[] nums,int index){
        res.add(new ArrayList<Integer>(list));
        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            back(nums,i+1);
            list.remove(list.size()-1);
        }
    }
    @Test
    public void xx(){
        int[] nums=new int[]{1,2,3};
        subsets(nums);
    }
}
