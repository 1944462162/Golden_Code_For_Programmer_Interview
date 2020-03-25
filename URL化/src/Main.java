/**
 * Author: wangJianBo
 * Date: 2020/3/25 10:09
 * Content: 简单
 */

class Solution {
    public String replaceSpaces(String S, int length) {
        return S.substring(0,length).replace(" ", "%20");
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String mr_john_smith____ = solution.replaceSpaces("     ", 5);
        System.out.println("|"+mr_john_smith____+"|");
    }
}
