/**
 * Author: wangJianBo
 * Date: 2020/5/6 9:56
 * Content:
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int min = 0;
    // private boolean flag = true;
    private boolean ans = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        help(root);
        return ans;
    }
    public int help(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = help(root.left);
        int right = help(root.right);
        if(Math.abs(left - right) > 1){
            ans = false;
        }
        return Math.max(left,right)+1;
    }
}
public class Main {
}
