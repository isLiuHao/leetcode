package leetcode;

import java.util.Stack;

public class demo394 {
    public String decodeString(String s) {
        Stack<Character> str=new Stack<>();
        Stack<Integer> num=new Stack<>();
        String res="";
        int multi=0;
        for(char c:s.toCharArray()){
            if(c>='0'&&c<='9'){
                multi=multi*10+c-'0';
            }
            else if(c=='['){
                str.push(c);
                num.push(multi);
                multi=0;
            }
            else if(c==']'){
                String ss="";String sss="";
                while(!str.isEmpty()){
                    char a=str.pop();
                    if(a!='[')ss=a+ss;
                    else break;
                }
                int count=num.pop();
                for(int j=0;j<count;j++)sss+=ss;
                for(int j=0;j<sss.length();j++)str.push(sss.charAt(j));
            }
            else{//字母
                str.push(c);
            }
        }
        while(!str.isEmpty()){
            char a=str.pop();
            if(a!='[')res=a+res;
            else break;
        }
        return res;
    }
}
