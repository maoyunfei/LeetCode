package LinkedListCycle;

import java.util.HashSet;
import java.util.Set;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> existed = new HashSet<ListNode>();
        ListNode current = head;
        while (current != null) {
            if (existed.contains(current)) {
                return true;
            }
            existed.add(current);
            current = current.next;
        }
        return false;
    }

}
