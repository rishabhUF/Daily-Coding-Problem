package LeetCode;

public class LeedCodeProblem141 {
	
	public static void main(String[] args)
	{
		ListNode head2 = new ListNode(2);
		ListNode b = head2;
		head2.next = new ListNode(4);
		hasCycle(b);
	}

public static boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    if(head == null || head.next == null)
        return false;
    while(fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(fast == slow)
        {
            return true;
        }
    }
    return false;
	}
}