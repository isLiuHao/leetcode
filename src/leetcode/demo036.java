package leetcode;

import java.util.HashMap;
import java.util.Map;

public class demo036 {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, Integer> []rows=new HashMap[9];
        HashMap<Character, Integer> []columns  = new HashMap[9];
        HashMap<Character, Integer> []boxes  = new HashMap[9];
        for(int i=0;i<9;i++){
            rows[i]=new HashMap<>();
            columns[i]=new HashMap<>();
            boxes[i]=new HashMap<>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char x = board[i][j];
                if (x >= '0' && x <= '9') {
                    if(rows[i].containsKey(x)){//每一行
                        return false;
                    }else {
                        rows[i].put(x,1);
                    }
                    if(columns[j].containsKey(x)){//每一列
                        return false;
                    }else {
                        columns[j].put(x,1);
                    }
                    if(boxes[(i/3)*3+j/3].containsKey(x)){//每一个子单元
                        return false;
                    }else {
                        boxes[(i/3)*3+j/3].put(x,1);
                    }
                }
            }
        }
        return true;
    }
}
