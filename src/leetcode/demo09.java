package leetcode;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Stack;

public class demo09 {
    @Test
    public boolean isPalindrome() {
        String s="()";

        LinkedList<Character> stack=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') stack.push('(');
            else if(s.charAt(i)=='{')stack.push('{');
            else if(s.charAt(i)=='[')stack.push('[');
            else if(stack.isEmpty()||s.charAt(i)!=stack.pop())return false;
        }
        return true;
    }
}
