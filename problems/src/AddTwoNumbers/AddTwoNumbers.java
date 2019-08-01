package AddTwoNumbers;

/**
 * Description
 *
 * @author maoyunfei
 * @date 2019-07-29
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int number1 = 0;
            if (l1 != null) {
                number1 = l1.val;
                l1 = l1.next;
            }
            int number2 = 0;
            if (l2 != null) {
                number2 = l2.val;
                l2 = l2.next;
            }
            int val = (number1 + number2 + carry) % 10;
            carry = (number1 + number2 + carry) / 10;
            current.next = new ListNode(val);
            current = current.next;
        }
        if (carry != 0) {
            current.next = new ListNode(carry);
        }
        return head.next;
    }
}
