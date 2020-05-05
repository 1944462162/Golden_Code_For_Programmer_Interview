import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * Author: wangJianBo
 * Date: 2020/4/29 8:15
 * Content:
 */
class MinStack {
    private ArrayList<Integer> arrayList;
    private Stack<Integer> stack;
    /** initialize your data structure here. */
    public MinStack() {
        arrayList = new ArrayList<>();
        stack = new Stack<>();
    }

    public void push(int x) {
        arrayList.add(x);
        if (!stack.isEmpty()) {
            stack.push(Math.min(x, stack.peek()));
        } else {
            stack.push(x);
        }
    }

    public void pop() {
        if (!arrayList.isEmpty()){
            arrayList.remove(arrayList.size()-1);
        }
        if (!stack.isEmpty()){
            stack.pop();
        }
    }

    public int top() {
        return arrayList.get(arrayList.size()-1);
    }

    public int getMin() {
        return stack.peek();
    }
}

public class Main {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-1);
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}
