import com.sun.media.sound.SoftShortMessage;

/**
 * Author: wangJianBo
 * Date: 2020/4/20 7:35
 * Content: 链表
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode frist = head;
        ListNode slow = head;
        ListNode head1 = head;
        ListNode prev = null;

        while (frist != null && frist.next != null){
            frist = frist.next.next;
            slow = slow.next;
            head1.next = prev;
            prev = head1;

            head1 = slow;
        }
        if (frist != null){
            slow = slow.next;
        }
        while (slow != null && prev != null){
            if (slow.val != prev.val){
                return  false;
            }
            slow = slow.next;
            prev = prev.next;
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(2);
        ListNode listNode5 = new ListNode(1);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        Solution solution = new Solution();
        boolean palindrome = solution.isPalindrome(listNode1);
        System.out.println(palindrome);
    }
}
