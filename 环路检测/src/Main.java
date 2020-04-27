/**
 * Author: wangJianBo
 * Date: 2020/4/27 7:55
 * Content: 链表
 *
 * 思路：
 *      1.根据慢指针是快指针的两倍判断是否有环
 *      2.根据环的位置将快指针指向头结点
 *      3.快慢指针同时相交，节点就是入口
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
    public ListNode detectCycle(ListNode head) {
        ListNode frist = head;
        ListNode end = head;
        while (end != null && end.next != null){
            frist = frist.next;
            end = end.next.next;
            if (frist == end){
                end = head;
                while (end != frist){
                    end = end.next;
                    frist = frist.next;
                }
                return frist;
            }
        }
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(3);
//        ListNode listNode2 = new ListNode(2);
//        ListNode listNode3 = new ListNode(0);
//        ListNode listNode4 = new ListNode(-4);

//        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode2;
        ListNode listNode = solution.detectCycle(listNode1);
        System.out.println(listNode.val);
    }
}
