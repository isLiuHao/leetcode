package leetcode;

import java.util.ArrayList;
import java.util.List;

public class demo022 {
    public List<String> generateParenthesis(int n) {
        List<String> lists=new ArrayList<>();
        generate(lists,n,n,new String());
        return lists;
    }
    public void generate(List<String> str,int left,int right,String ss){
        if(left==0&&right==0){
            str.add(ss.toString());
            return;
        }
        if(left>0){
            generate(str,left-1,right,ss+"(");
        }
        if(right>left){
            generate(str,left,right-1,ss+")");
        }
    }
}
