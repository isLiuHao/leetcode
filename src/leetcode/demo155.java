package leetcode;

import java.util.Stack;

public class demo155 {
    class MinStack {
        Stack<Integer> xstack;
        Stack<Integer> minstack;
        /** initialize your data structure here. */
        public MinStack() {
            xstack=new Stack<>();
            minstack=new Stack<>();
            minstack.push(Integer.MAX_VALUE);
        }

        public void push(int val) {
            xstack.push(val);
            if(val<=minstack.peek())
                minstack.add(val);
        }

        public void pop() {
            int a=xstack.pop();
            if(a==minstack.peek())
                minstack.pop();
        }

        public int top() {
            return xstack.peek();
        }

        public int getMin() {
            return minstack.peek();
        }
    }
}
