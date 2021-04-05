package leetcode;

public class demo059 {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int xmax=n-1,xstart=0;
        int ymax=n-1,ystart=0;
        int k=0;
        while(true){
            for(int j=ystart;j<=ymax;j++){
                k++;
                matrix[xstart][j]=k;
            }
            if(++xstart>xmax)break;//删去上边界
            for(int i=xstart;i<=xmax;i++){
                k++;
                matrix[i][ymax]=k;
            }
            if(--ymax<ystart)break;//删去右边界
            for(int j=ymax;j>=ystart;j--){
                k++;
                matrix[xmax][j]=k;
            }
            if(--xmax<xstart)break;//删去下边界
            for(int i=xmax;i>=xstart;i--){
                k++;
                matrix[i][ystart]=k;
            }
            if(++ystart>ymax)break;//删去左边界
        }
        return matrix;
    }
}
