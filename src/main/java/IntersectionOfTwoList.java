/**
 * @author Li Jingwei
 * @date 2019/7/18 下午3:50
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionOfTwoList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        int lenA = 0, lenB = 0;
        ListNode tailA = headA, tailB = headB;
        while(tailA != null) {
            tailA = tailA.next;
            lenA++;
        }
        while(tailB != null) {
            tailB = tailB.next;
            lenB++;
        }
        int diff;
        if(lenA>lenB){
            diff = lenA - lenB;
            while (diff>0){
                headA = headA.next;
                diff--;
            }
        } else {
            diff = lenB - lenA;
            while (diff>0){
                headB = headB.next;
                diff--;
            }
        }
        while (headA != null && headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}