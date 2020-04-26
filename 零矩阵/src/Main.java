/**
 * Author: wangJianBo
 * Date: 2020/4/26 8:00
 * Content: 数组
 */

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[][] flag = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    flag[i][j] = true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (flag[i][j]){
                    for (int k = 0; k < matrix[0].length; k++) {
                        matrix[i][k] = 0;
                    }
                    for (int k = 0; k < matrix.length; k++) {
                        matrix[k][j] = 0;
                    }
                }
            }
        }
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.setZeroes(new int[][] {
                {0,1}
        });
    }
}
