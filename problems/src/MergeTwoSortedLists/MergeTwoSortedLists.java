package MergeTwoSortedLists;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode resultHead = null;
        ListNode resultIndex = null;
        ListNode index1 = l1;
        ListNode index2 = l2;
        if (index1.val > index2.val) {
            ListNode newNode = new ListNode(index2.val);
            resultIndex = newNode;
            resultHead = resultIndex;
            index2 = index2.next;
        } else {
            ListNode newNode = new ListNode(index1.val);
            resultIndex = newNode;
            resultHead = resultIndex;
            index1 = index1.next;
        }
        while (index1 != null && index2 != null) {
            if (index1.val > index2.val) {
                ListNode newNode = new ListNode(index2.val);
                index2 = index2.next;
                resultIndex.next = newNode;
                resultIndex = resultIndex.next;
            } else {
                ListNode newNode = new ListNode(index1.val);
                index1 = index1.next;
                resultIndex.next = newNode;
                resultIndex = resultIndex.next;
            }
        }
        if (index1 == null) {
            while (index2 != null) {
                ListNode newNode = new ListNode(index2.val);
                index2 = index2.next;
                resultIndex.next = newNode;
                resultIndex = resultIndex.next;
            }
        }
        if (index2 == null) {
            while (index1 != null) {
                ListNode newNode = new ListNode(index1.val);
                index1 = index1.next;
                resultIndex.next = newNode;
                resultIndex = resultIndex.next;
            }
        }

        return resultHead;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode head = null;
        if (l1.val <= l2.val) {
            head = l1;
            head.next = mergeTwoLists2(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists2(l1, l2.next);
        }

        return head;
    }
}
