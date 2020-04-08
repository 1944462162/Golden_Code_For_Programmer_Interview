import java.util.HashMap;

/**
 * Author: wangJianBo
 * Date: 2020/4/8 9:26
 * Content: 查找回文串的规律
 */


class Solution {
    public boolean canPermutePalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        int count = 0;
        for (Integer value : map.values()) {
            if (value % 2 != 0){
                count++;
            }
        }
        if (count > 1){
            return false;
        }
        else {
            return true;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean tactcoa = solution.canPermutePalindrome("");
        System.out.println(tactcoa);
    }
}
