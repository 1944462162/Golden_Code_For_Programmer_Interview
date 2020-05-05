/**
 * Author: wangJianBo
 * Date: 2020/5/5 19:00
 * Content: 动态规划
 */
class Solution {
    public int waysToStep(int n) {
        long[] a = new long[n+5];
        a[1] = 1;
        a[2] = 2;
        a[3] = 4;
        for(int i = 4; i <= n; i++){
            a[i] = (a[i-1]% 1000000007 + a[i-2]% 1000000007 + a[i-3]% 1000000007)% 1000000007;
        }
        return (int)a[n]%1000000007;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.waysToStep(61));
    }
}
