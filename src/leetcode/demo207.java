package leetcode;

import java.util.ArrayList;
import java.util.List;

public class demo207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjacency = new ArrayList<>();
        for(int i = 0; i < numCourses; i++)
            adjacency.add(new ArrayList<>());
        int[] flags = new int[numCourses];
        //邻接表赋值
        for(int[] cp:prerequisites){
            adjacency.get(cp[1]).add(cp[0]);
        }
        for(int i = 0; i < numCourses; i++){
            if(!dfs(adjacency,i,flags))return false;
        }
        return true;
    }
    //深度优先遍历
    public boolean dfs(List<List<Integer>> adjacency,int i,int[] flags){
        List<Integer> list = adjacency.get(i);
        if(flags[i] == 1) return false;//已经访问过 存在环
        if(flags[i] == -1) return true;//其他点访问的
        flags[i] = 1; //标记访问
        for(int j:list){
            if(!dfs(adjacency,j,flags))return false;
        }
        flags[i] = -1;//遍历完改为 其他点访问
        return true;
    }
}
