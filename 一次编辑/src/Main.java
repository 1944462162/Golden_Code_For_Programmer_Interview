/**
 * Author: wangJianBo
 * Date: 2020/4/8 9:34
 * Content: 字符串处理
 *
 * 思路：
 *
 * 1. 首先判断是否相等
 * 2. 判断长度是否相差大于一
 * 3. 如果长度相差等于一，只能进行删除字符操作，所以利用双指针，中的一个指针进行加一就行
 */

class Solution {
    public boolean oneEditAway(String first, String second) {

        if (first.equals("") && second.length() == 1 || second.equals("") && first.length() == 1){
            return true;
        }


        int i = 0;
        int j = 0;
        if (first.equals(second)){
            return true;
        }
        if (Math.abs(first.length() - second.length()) > 1){
            return false;
        }
        int count = 0;
        if (Math.abs(first.length() - second.length()) == 1){
            if (first.length() > second.length()){
                while (i < first.length()){
                    if (j == second.length()){
                        count++;
                        break;
                    }
                    if (first.charAt(i) != second.charAt(j)){
                        count++;
                        i++;
                    }
                    else {
                        i++;
                        j++;
                    }
                }
            }
            else {
                while (j < second.length()){
                    if (i == first.length()){
                        count++;
                        break;
                    }
                    if (first.charAt(i) != second.charAt(j)){
                        count++;
                        j++;
                    }
                    else {
                        i++;
                        j++;
                    }
                }
            }
        }
        if (Math.abs(first.length() - second.length()) == 0){
            for (int k = 0; k < first.length(); k++) {
                if (first.charAt(k) != second.charAt(k)){
                    count++;
                }
            }
        }

        return count <= 1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean b = solution.oneEditAway("teacher", "bleacher");
        System.out.println(b);
    }
}
