import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: wangJianBo
 * Date: 2020/5/6 8:36
 * Content: 二叉树的层序遍历
 *
 */


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode[] listOfDepth(TreeNode tree) {
        if(tree == null){
            return new ListNode[0];
        }
        Queue<TreeNode> queue = new LinkedList();
        TreeNode root = tree;
        ArrayList<ListNode> resList = new ArrayList<>();
        int k = 0;
        queue.offer(root);
        while(!queue.isEmpty()){
            ListNode head = null;
            ListNode Next = null;
            int length = queue.size();
            boolean flag = true;
            for(int i = 0; i < length; i++){
                TreeNode node = queue.poll();
                if(flag){
                    Next = new ListNode(node.val);
                    head = Next;
                    flag = false;
                }
                else{
                    Next.next = new ListNode(node.val);
                    Next = Next.next;
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            resList.add(head);
        }
        ListNode[] ans = new ListNode[resList.size()];
        return resList.toArray(ans);
    }
}
public class Main {
}
