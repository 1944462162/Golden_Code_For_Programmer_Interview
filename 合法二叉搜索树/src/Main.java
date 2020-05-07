/**
 * Author: wangJianBo
 * Date: 2020/5/7 8:03
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
    private boolean flag = true;
    private ArrayList<Integer> a = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        help(root);
        if(a.size() == 1 || root == null){
            return true;
        }
        int min = a.get(0);
        for(int i = 1; i < a.size(); i++){
            if(a.get(i) <= min){
                flag = false;
            }
            else{
                min = a.get(i);
            }
        }
        return flag;
    }
    public void help(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left != null){
            help(root.left);
        }
        a.add(root.val);
        if(root.right != null){
            help(root.right);
        }
    }
}
public class Main {
}
