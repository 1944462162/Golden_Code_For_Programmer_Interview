import com.sun.javafx.collections.MappingChange;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Author: wangJianBo
 * Date: 2020/3/25 10:00
 * Content: 判断字符串转换之后能否成为另一个字符串
 */

class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (s1.length() != s2.length()){
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (c1[i] != c2[i]){
                return false;
            }
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean b = solution.CheckPermutation("abc", "bca");
        System.out.println(b);
    }
}
