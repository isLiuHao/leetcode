package leetcode;

public class demo048 {
    public void rotate1(int[][] matrix) {
        int n = matrix.length;
        int[][] matrix_new = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix_new[j][n-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=matrix_new[i][j];
            }
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){//对角线翻转
            for(int j=0;j<i;j++){
                int temp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        for(int i=0;i<n/2;i++){   //水平翻转
            for(int j=0;j<n;j++){
                int temp=matrix[i][n-j-1];
                matrix[i][n-j-1]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
    }
}
