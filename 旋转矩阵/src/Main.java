/**
 * Author: wangJianBo
 * Date: 2020/4/26 7:37
 * Content: 数组
 *
 * 思路：
 * 1. 首先将数组以左上到右下进行翻转
 * 2. 将数组以中轴线进行翻转
 */
class Solution {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = i + 1; j < matrix.length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < (matrix.length/2); j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] =  tmp;
            }
        }
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.rotate(new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        });
    }
}
