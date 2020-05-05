/**
 * Author: wangJianBo
 * Date: 2020/4/28 9:05
 * Content:
 */


class TripleInOne {

    int[] stack;
    int i1;
    int j1;
    int i2;
    int j2;
    int i3;
    int j3;
    int k1;
    int k2;
    int k3;
    public TripleInOne(int stackSize) {
        stack = new int[stackSize * 3];
        i1 = 0;
        j1 = stackSize - 1;
        k1 = i1-1;
        i2 = stackSize;
        j2 = stackSize * 2 - 1;
        k2 = i2-1;
        i3 = stackSize * 2;
        j3 = stackSize * 3 -1;
        k3 = i3-1;
    }

    public void push(int stackNum, int value) {
        if (stackNum == 0){
            if (k1 < j1){
                k1++;
                stack[k1] = value;
            }
        }
        if (stackNum == 1){
            if (k2 < j2){
                k2++;
                stack[k2] = value;
            }
        }
        if (stackNum == 2){
            if (k3 < j3){
                k3++;
                stack[k3] = value;
            }
        }
    }

    public int pop(int stackNum) {
        if (stackNum == 0){
            if (k1 >= i1) {
                int tmp = stack[k1];
                k1--;
                return tmp;
            }
            else {
                return -1;
            }
        }
        if (stackNum == 1){

            if (k2 >= i2){
                int tmp = stack[k2];
                k2--;
                return tmp;
            }
            else {
                return -1;
            }
        }
        if (stackNum == 2){

            if (k3 >= i3){
                int tmp = stack[k3];
                k3--;
                return tmp;
            }
            else {
                return -1;
            }
        }
        return 0;
    }

    public int peek(int stackNum) {
        if (stackNum == 0){
            if (k1 >= i1 && k1 <= j1){
                return stack[k1];
            }
            else {
                return -1;
            }
        }
        if (stackNum == 1){
            if (k2 >= i2 && k2 <= j2){
                return stack[k2];
            }
            else {
                return -1;
            }
        }
        if (stackNum == 2){
            if (k3 >= i3 && k3 <= j3){
                return stack[k3];
            }
            else {
                return -1;
            }
        }
        return 0;
    }

    public boolean isEmpty(int stackNum) {
        if (stackNum == 0){
            if (k1 >= i1 ){
                return false;
            }
        }
        if (stackNum == 1){
            if (k2 >= i2){
                return false;
            }
        }
        if (stackNum == 2){
            if (k3 >= i3){
                return false;
            }
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        TripleInOne tripleInOne = new TripleInOne(18);
//        tripleInOne.push(0, 1);
//        tripleInOne.push(0, 2);
//        System.out.println(tripleInOne.pop(0));
//        System.out.println(tripleInOne.pop(0));
//        System.out.println(tripleInOne.pop(0));
//        System.out.println(tripleInOne.pop(0));
//        System.out.println(tripleInOne.isEmpty(0));
        System.out.println(tripleInOne.peek(1));
    }
}
