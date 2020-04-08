/**
 * Author: wangJianBo
 * Date: 2020/4/8 10:26
 * Content: 字符串处理
 */

class Solution {
    public String compressString(String S) {
        if (S.length() == 0){
            return "";
        }
        char c = '*';
        int count = 0;
        S = S + "*";
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != c){
                ss.append(c).append(count);
                c = S.charAt(i);
                count = 0;
            }
            count++;
        }

        if (ss.substring(2).length() < S.length() - 1){
            return ss.toString().substring(2);
        }
        return S.substring(0, S.length()-1);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String string = solution.compressString("bb");
        System.out.println(string);
    }
}
