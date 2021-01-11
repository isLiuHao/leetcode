package leetcode;

public class demo06 {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        String rows[]=new String[numRows];
        for(int i=0;i<numRows;i++) rows[i]="";
        int loc=0;int flag=1;
        for(int i=0;i<s.length();i++){
            rows[loc]+=s.charAt(i);
            loc=loc+flag;
            if(loc==numRows-1||loc==0)flag=-flag;
        }

        String ans="";
        for(String row:rows){
            ans+=row;
        }
        return ans;
    }
}
