package _225_ImplementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q1 = new LinkedList<Integer> ();
    Queue<Integer> q2 = new LinkedList<Integer> ();

    int size;

    /** Initialize your data structure here. */
    public MyStack() {
        size = 0;
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        size++;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        for (int i = 0; i < size - 1; i++) {
            q2.add(q1.remove());
        }
        int a = q1.remove();
        size--;
        for (int i = 0; i < size; i++) {
            q1.add(q2.remove());
        }
        return a;
    }

    /** Get the top element. */
    public int top() {
        for (int i = 0; i < size - 1; i++) {
            q2.add(q1.remove());
        }
        int a = q1.remove();
        q2.add(a);
        for (int i = 0; i < size; i++) {
            q1.add(q2.remove());
        }
        return a;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return size == 0;
    }
}