package LeetCode;

//Reverse a linked list
public class LeetCodeProblem237{
	public static void main(String[] args){
		ListNode head1 = new ListNode(1);
		ListNode a = head1;
		head1.next = new ListNode(3);
		ListNode head2 = new ListNode(2);
		ListNode b = head2;
		head2.next = new ListNode(4);
		ListNode r = reverse(a);
		print(r);
	}
	
	public static ListNode reverse(ListNode head)
	{
		ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
		return curr;
	}
	
	public static void print(ListNode l)
	{
		while(l!=null){
			System.out.println(l.val);
			l = l.next;
		}
	}
}
