package leetcode;

import java.util.Stack;

public class demo020 {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')stack.push('(');
            else if(s.charAt(i)=='[')stack.push('[');
            else if(s.charAt(i)=='{')stack.push('{');
            else if(s.charAt(i)==')'){
                if(stack.empty())return false;
                else {
                    char x=stack.pop();
                    if(x!='(')return false;
                }
            }
            else if(s.charAt(i)==']'){
                if(stack.empty())return false;
                else {
                    char x=stack.pop();
                    if(x!='[')return false;
                }
            }
            else if(s.charAt(i)=='}'){
                if(stack.empty())return false;
                else {
                    char x=stack.pop();
                    if(x!='{')return false;
                }
            }
        }
        if(stack.empty())
            return true;
        else  return false;
    }
}
