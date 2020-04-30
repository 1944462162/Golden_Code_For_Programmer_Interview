import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2020/4/30 9:27
 * Content: 数组
 */

class Solution {
    public int missingNumber(int[] nums) {
        boolean[] flag = new boolean[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            flag[nums[i]] = true;
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!flag[i]){
                return i;
            }
        }
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}
