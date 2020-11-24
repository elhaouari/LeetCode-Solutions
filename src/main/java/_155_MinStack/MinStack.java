package _155_MinStack;

import java.util.Stack;

/**
 * Problem link: https://leetcode.com/problems/min-stack/
 */
public class MinStack {

    private Stack<Integer> values = new Stack<>();
    private Stack<Integer> mins = new Stack<>();

    public void push(int x) {
        values.push(x);

        if (mins.empty() || x <= mins.peek()) {
            mins.push(x);
        }
    }

    public void pop() {
        int value = values.pop();

        if (mins.peek() == value) {
            mins.pop();
        }
    }

    public int top() {
        return values.peek();
    }

    public int getMin() {
        return mins.peek();
    }
}
