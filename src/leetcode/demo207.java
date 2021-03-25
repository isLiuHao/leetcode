package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class demo207 {
    public boolean canFinish1(int numCourses, int[][] prerequisites) {
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

    //拓扑排序
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list=new ArrayList<>();//邻接表存储
        int[] indegree=new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        for(int[] cp:prerequisites){
            list.get(cp[1]).add(cp[0]);
            indegree[cp[1]]++;
        }
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)
                queue.add(i);
        }
        while(!queue.isEmpty()){
            int i=queue.poll();
            for(int x:list.get(i)){
                indegree[x]--;
                if(indegree[x]==0)
                    queue.add(x);
            }
        }
        for(int i=0;i<numCourses;i++) {
            if (indegree[i] != 0)return false;
        }
        return true;
    }
}
