package leetcode;

public class demo079 {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(dfs(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }
    boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]!=word[k])return false;
        if(k==word.length-1) return true;
        boolean flag=false;
        board[i][j]=' ';
        flag=dfs(board,word,i+1,j,k+1)||dfs(board,word,i,j+1,k+1)
                ||dfs(board,word,i-1,j,k+1)||dfs(board,word,i,j-1,k+1);
        board[i][j]=word[k];
        return flag;
    }
}
