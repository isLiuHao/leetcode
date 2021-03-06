package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo039 {

    List<List<Integer>> lists=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates,target,0);
        return lists;
    }
    public void dfs(int[] candidates,int target,int index){//index表示使用candidates第几个
        for(int i=index;i<candidates.length;i++){
            if(candidates[i]<target){
                list.add(candidates[i]);
                dfs(candidates,target-candidates[i],i);
                list.remove(list.size()-1);
            }
            else if(candidates[i]==target){  //最后一个
                list.add(candidates[i]);
                lists.add(new ArrayList<Integer>(list));
                list.remove(list.size()-1);
                break;
            }else {
                break;
            }
        }
    }
    @Test
    public void test(){
        int[] candidates=new int[]{2,3,6,7};
        combinationSum(candidates,7);
        System.out.println(lists);
    }
}
