package leetcode;

import java.util.ArrayList;
import java.util.List;

public class demo046 {
    List<List<Integer>> lists=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        int[] vis=new int[nums.length];
        dfs(nums,0,vis);
        return lists;
    }
    public void dfs(int[] nums,int index,int[] vis){//index表示填第几个
        for(int i=0;i<nums.length;i++){
            if(vis[i]==0){//没有用过
                if(index==nums.length-1){//最后一个
                    list.add(nums[i]);
                    lists.add(new ArrayList<Integer>(list));
                    list.remove(index);
                    break;
                }
                vis[i]=1;
                list.add(nums[i]);
                dfs(nums,index+1,vis);
                vis[i]=0;
                list.remove(index);
            }
        }
    }
}
