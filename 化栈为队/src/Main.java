import java.util.Stack;

/**
 * Author: wangJianBo
 * Date: 2020/4/29 8:47
 * Content: 栈和对列
 *
 * 思路：
 *     1.添加：添加到stack1；
 *     2.判断是否是空：判断两个栈是不是空的
 *     3.pop：首先pop stack2然后将stack1中的元素添加到stack2中，再pop stack2
 *     3.top：首先top stack2然后将stack1中的元素添加到stack2中，再top stack2
 *
 */

class MyQueue {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (!stack2.isEmpty()){
            return stack2.pop();
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (!stack2.isEmpty()){
            return stack2.peek();
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
