/**
 * Author: wangJianBo
 * Date: 2020/4/19 9:13
 * Content:
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
public class Main {
}
