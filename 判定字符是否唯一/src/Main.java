import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: wangJianBo
 * Date: 2020/3/23 9:11
 * Content: 判断是否存在重复
 */

class Solution {
    public boolean isUnique(String astr) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < astr.length(); i++) {
            set.add(astr.charAt(i));
        }
        return set.size() == astr.length();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean leetcode = solution.isUnique("leetcode");
        System.out.println(leetcode);
    }
}
