import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: wangJianBo
 * Date: 2020/5/5 10:27
 * Content: 队列
 *
 * 思路：
 *    1.创建两个队列
 *    2.加入计数器
 *    3.dequeueAny（）时，先将数字小的先出列
 */
class AnimalShelf {

    private Queue<Integer> dog = new LinkedList<>();
    private Queue<Integer> cat = new LinkedList<>();
    private int count;
    public AnimalShelf() {
        count = 0;
    }

    public void enqueue(int[] animal) {
        if (animal[1] == 0){
            cat.add(++count);
            cat.add(animal[0]);
            cat.add(animal[1]);
        }
        if (animal[1] == 1){
            dog.add(++count);
            dog.add(animal[0]);
            dog.add(animal[1]);
        }
    }

    public int[] dequeueAny() {
        int[] ans = new int[2];
        if (cat.isEmpty() && dog.isEmpty()){
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        if (cat.isEmpty()){
            dog.poll();
            ans[0] = dog.poll();
            ans[1] = dog.poll();
            return ans;
        }
        if (dog.isEmpty()){
            cat.poll();
            ans[0] = cat.poll();
            ans[1] = cat.poll();
            return ans;
        }

        if (cat.peek() < dog.peek()){
            cat.poll();
            ans[0] = cat.poll();
            ans[1] = cat.poll();
        }
        else {
            dog.poll();
            ans[0] = dog.poll();
            ans[1] = dog.poll();
        }
        return ans;
    }

    public int[] dequeueDog() {
        int[] ans = new int[2];
        if (dog.isEmpty()){
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        dog.poll();
        ans[0] = dog.poll();
        ans[1] = dog.poll();
        return ans;
    }

    public int[] dequeueCat() {
        int[] ans = new int[2];
        if (cat.isEmpty()){
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        cat.poll();
        ans[0] = cat.poll();
        ans[1] = cat.poll();
        return ans;
    }
}

/**
 * Your AnimalShelf object will be instantiated and called as such:
 * AnimalShelf obj = new AnimalShelf();
 * obj.enqueue(animal);
 * int[] param_2 = obj.dequeueAny();
 * int[] param_3 = obj.dequeueDog();
 * int[] param_4 = obj.dequeueCat();
 */

public class Main {
    public static void main(String[] args) {
        AnimalShelf obj = new AnimalShelf();
        obj.enqueue(new int[]{0,0});
        obj.enqueue(new int[]{1,0});
        System.out.println(Arrays.toString(obj.dequeueCat()));
        System.out.println(Arrays.toString(obj.dequeueDog()));
        System.out.println(Arrays.toString(obj.dequeueAny()));
    }
}
