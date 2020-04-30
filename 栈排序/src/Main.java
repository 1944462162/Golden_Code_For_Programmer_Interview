import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * Author: wangJianBo
 * Date: 2020/4/30 8:05
 * Content: 优先队列
 */

class SortedStack {

    Queue<Integer> queue = new PriorityQueue<>();
    public SortedStack() {

    }

    public void push(int val) {
        queue.offer(val);
    }

    public void pop() {
        if (!queue.isEmpty()){
            queue.poll();
        }
    }

    public int peek() {
        if (!queue.isEmpty()){
            return queue.peek();
        }
        else {
            return -1;
        }
    }

    public boolean isEmpty() {
        return  queue.isEmpty();
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
