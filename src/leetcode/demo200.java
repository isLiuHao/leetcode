package leetcode;

public class demo200 {
    public int numIslands(char[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    res++;
                    deep(grid,i,j);
                }
            }
        }
        return res;
    }
    public void deep(char[][] grid,int x,int y){
        if(grid[x][y]=='0')return;
        else grid[x][y]='0';
        if(x+1<grid.length)
            deep(grid,x+1,y);
        if(y+1<grid[x].length)
            deep(grid,x,y+1);
        if(x-1>=0)
            deep(grid,x-1,y);
        if(y-1>=0)
            deep(grid,x,y-1);
    }
}
