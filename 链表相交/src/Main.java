/**
 * Author: wangJianBo
 * Date: 2020/4/21 7:44
 * Content: 链表相交
 */

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode listNode1 = headA;
        ListNode listNode2 = headB;
        while (listNode1 != listNode2){
            if (listNode1 != null)
            {
                listNode1 = listNode1.next;
            }
            else {
                listNode1 = headB;
            }
            if (listNode2 != null){
                listNode2 = listNode2.next;
            }
            else {
                listNode2 = headA;
            }
        }
        return listNode1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(8);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(5);
        ListNode listNode7 = new ListNode(0);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode6.next = listNode7;
        listNode7.next = listNode2;
        ListNode intersectionNode = solution.getIntersectionNode(listNode1, listNode6);
        System.out.println(intersectionNode.val);
    }
}
