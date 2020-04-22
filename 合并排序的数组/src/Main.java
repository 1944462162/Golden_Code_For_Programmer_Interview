import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2020/4/22 8:02
 * Content: 数组
 */
class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        for (int i = m; i < m+n; i++) {
            A[i] = B[i - m];
        }
        Arrays.sort(A);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.merge(new int[]{1,2,3,0,0,0}, 3,new int[]{2,5,6}, 3);
    }
}
