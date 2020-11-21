package leetcode;

import org.junit.Test;

public class demo38 {
    @Test
    public void aa(){
        countAndSay(5);
    }
    public String countAndSay(int n) {
        if(n==1)return "1";
        String s="";
        String str=countAndSay(n-1);
        int i,p=0,count=1;
        for(i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(p)){
                count++;
            }else {
                s=s+count+str.charAt(p);
                p=i;count=1;
            }
        }
        if(p!=i){
            s=s+count+str.charAt(p);
        }
        return s;
    }
}
