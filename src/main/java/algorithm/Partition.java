package algorithm;

import domain.ListNode;

/**
 * @author Li Jingwei
 * @date 2019/10/9 下午4:18
 */
public class Partition {


    public ListNode partition(ListNode head, int x) {
        if(head == null) return head;
        ListNode newHead = new ListNode(x);
        ListNode tmpHead = new ListNode(x);
        newHead.next = head;
        ListNode tmp1 = newHead, tmp2 = tmpHead;
        while (tmp1.next != null) {
            if(tmp1.next.val >= x) {
                tmp2.next = tmp1.next;
                tmp1.next = tmp1.next.next;
                tmp2 = tmp2.next;
            } else {
                tmp1 = tmp1.next;
            }
        }
        tmp1.next = tmpHead.next;
        tmp2.next = null;
        return newHead.next;
    }

    private void test() {
        ListNode t1 = new ListNode(1);
        ListNode t2 = new ListNode(4);
        ListNode t3 = new ListNode(3);
        ListNode t4 = new ListNode(2);
        ListNode t5 = new ListNode(5);
        ListNode t6 = new ListNode(2);
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = t5;
        t5.next = t6;
        ListNode partition = partition(t1, 3);
    }

    public static void main(String[] args) {
        new Partition().test();
    }

}

