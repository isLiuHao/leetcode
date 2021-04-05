package leetcode;

import java.util.ArrayList;
import java.util.List;

public class demo054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m=matrix.length,n=matrix[0].length;
        int xmax=m-1,xstart=0;
        int ymax=n-1,ystart=0;
        while(true){
            for(int j=ystart;j<=ymax;j++){
                res.add(matrix[xstart][j]);
            }
            if(++xstart>xmax)break;//删去上边界
            for(int i=xstart;i<=xmax;i++){
                res.add(matrix[i][ymax]);
            }
            if(--ymax<ystart)break;//删去右边界
            for(int j=ymax;j>=ystart;j--){
                res.add(matrix[xmax][j]);
            }
            if(--xmax<xstart)break;//删去下边界
            for(int i=xmax;i>=xstart;i--){
                res.add(matrix[i][ystart]);
            }
            if(++ystart>ymax)break;//删去左边界
        }
        return res;
    }
}
