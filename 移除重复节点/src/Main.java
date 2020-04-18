import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * Author: wangJianBo
 * Date: 2020/4/18 19:14
 * Content: 链表
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        ListNode listNode = head;
        LinkedHashSet<Integer> listNodes = new LinkedHashSet<>();
        while (listNode != null){
            listNodes.add(listNode.val);
            listNode = listNode.next;
        }
        ListNode ans = new ListNode(-1);
        ListNode h = ans;
        for (Integer node : listNodes) {
            ans.next = new ListNode(node);
            ans = ans.next;
        }
        return h.next;
    }
}
public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(2);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        Solution solution = new Solution();
        ListNode listNode6 = solution.removeDuplicateNodes(listNode);
        while (listNode6 != null){
            System.out.println(listNode6.val);
            listNode6 = listNode6.next;
        }


    }
}
