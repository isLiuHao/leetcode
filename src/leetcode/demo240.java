package leetcode;

public class demo240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length,n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==target){
                    return true;
                }
                else if(matrix[i][j]>target){
                    m=j+1;break;
                }
            }
        }
        return false;
    }
    public boolean searchMatrix1(int[][] matrix, int target) {
        int n = matrix.length-1,m = 0;
        while(n>=0&&m<=matrix[0].length-1){
            if(matrix[n][m]>target){
                n--;
            }else if(matrix[n][m]<target){
                m++;
            }else{
                return true;
            }
        }
        return false;
    }
}
