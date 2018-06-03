package LeetCode;

// 19. Remove Nth Node From End of List
public class LeetCodeProblem19 {

	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        if(head == null)
	            return head;
	        ListNode start = new ListNode(0);
	        start.next = head;
	        ListNode fast = start;
	        ListNode slow = start;
	        while(n>=0)
	        {
	            fast = fast.next;
	            n--;
	        }
	        while(fast!= null){
	            slow = slow.next;
	            fast = fast.next;
	        }
	        slow.next = slow.next.next;
	        return start.next;
	    }
}
