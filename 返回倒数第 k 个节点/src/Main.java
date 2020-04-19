/**
 * Author: wangJianBo
 * Date: 2020/4/19 8:57
 * Content: 链表
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public int kthToLast(ListNode head, int k) {
        ListNode listNode = head;
        ListNode listNode1 = head;
        int count = 0;
        while (count < k){
            listNode = listNode.next;
            count++;
        }

        while (listNode != null){
            listNode = listNode.next;
            listNode1 = listNode1.next;
        }
        return listNode1.val;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
