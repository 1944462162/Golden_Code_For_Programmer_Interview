/**
 * Author: wangJianBo
 * Date: 2020/4/18 19:02
 * Content:
 */
class Solution {
    public boolean isFlipedString(String s1, String s2) {
        if (s1.equals("")&& s2.equals("")){
            return true;
        }
        if (s1.length() != s2.length()){
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            String ss1 = s1.substring(0,i);
            String ss2 = s1.substring(i);
            if (s2.equals(ss2 + ss1)){
                return true;
            }
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean flipedString = solution.isFlipedString("a", "a");
        System.out.println(flipedString);
    }
}
