/**
 * Author: wangJianBo
 * Date: 2020/4/22 8:16
 * Content: 阶乘尾零
 */


class Solution {
    public int trailingZeroes(int n) {
       return hepl(n);
    }
    private int hepl(int n) {
        if (n < 5){
            return 0;
        }
        return hepl(n / 5) + n / 5;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.trailingZeroes(30);
        System.out.println(i);
    }
}
