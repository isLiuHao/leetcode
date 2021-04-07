package leetcode;

import java.util.Stack;

public class demo739 {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();//递减栈
        int length = T.length;
        int[] result = new int[length];
        stack.push(0);
        for(int i=1;i<T.length;i++){
            while(!stack.isEmpty()&&T[i]>T[stack.peek()]){
                int j=stack.pop();
                result[j]=i-j;
            }
            stack.push(i);
        }
        return result;
    }
}
