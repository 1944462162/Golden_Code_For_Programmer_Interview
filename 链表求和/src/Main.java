/**
 * Author: wangJianBo
 * Date: 2020/4/27 7:21
 * Content: 链表
 *
 * 思路：
 * 大数加法
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a = 0;
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode ans = new ListNode(-1);
        ListNode head = ans;
        while (head1 != null || head2 != null){
            ans.next = new ListNode(-1);
            ans = ans.next;
            int tmp;
            if (head1 == null){
                tmp = head2.val + a;
                a = tmp / 10;
                ans.val = tmp % 10;
                head2 = head2.next;
            }
            else if (head2 == null){
                tmp = head1.val + a;
                a = tmp / 10;
                ans.val = tmp % 10;
                head1 = head1.next;
            }
            else {
                tmp = head1.val + head2.val + a;
                a = tmp / 10;
                ans.val = tmp % 10;
                head1 = head1.next;
                head2 = head2.next;
            }

        }
        if (a != 0){
            ans.next = new ListNode(a);
        }
        return head.next;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(9);
        ListNode listNode3 = new ListNode(9);
        ListNode listNode4 = new ListNode(9);
        ListNode listNode5 = new ListNode(9);
        ListNode listNode6 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        ListNode listNode = solution.addTwoNumbers(listNode1, listNode6);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
