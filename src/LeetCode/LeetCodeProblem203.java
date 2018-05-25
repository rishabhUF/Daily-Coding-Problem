package LeetCode;

public class LeetCodeProblem203 {

	public static void main(String[] args)
	{
		ListNode head2 = new ListNode(2);
		ListNode b = head2;
		head2.next = new ListNode(4);
		ListNode r = removeElements(b,2);
	}
	
	 public static ListNode removeElements(ListNode head, int val) {
		        ListNode pointer = head;
		        if(head == null) return null;
		        while(pointer.next!= null){
		            if(pointer.next.val == val) pointer.next = pointer.next.next;
		            else 
		                pointer = pointer.next;
		        }
		        return head.val == val ? head.next : head;
		    }
}
