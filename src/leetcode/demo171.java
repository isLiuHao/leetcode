package leetcode;

public class demo171 {
    public int titleToNumber(String s) {
        int x=0;int count=1;
        for(int i=s.length()-1;i>=0;i--){
            x=(s.charAt(i)-'A'+1)*count;
            count=count*26;
        }
        return x;

    }
}
