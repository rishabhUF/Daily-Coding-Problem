package LeetCode;
//Merge Two Sorted Lists

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
public class LeetCodeProblem21 {

	public static void main(String[] args){
		ListNode head1 = new ListNode(1);
		ListNode a = head1;
		head1.next = new ListNode(3);
		
		ListNode head2 = new ListNode(2);
		ListNode b = head2;
		head2.next = new ListNode(4);
		
		ListNode r = merge(a,b);
		print(r);
	}
	
	public static ListNode merge(ListNode head1, ListNode head2)
	{
		ListNode newHead = new ListNode(0);
		ListNode returnHead = newHead;
		if(head1 == null && head2 == null)
			return null;
		else if(head1!= null && head2 == null)
			return head1;
		else if(head1 == null && head2!= null)
			return head2;
		else
		{
			while(head1!=null && head2!=null)
			{
				if(head1.val < head2.val){
					newHead.next = new ListNode(head1.val);
					head1 = head1.next;
				}
				else{
					newHead.next = new ListNode(head2.val);
					head2 = head2.next;
				}
				newHead = newHead.next;
			}
			while(head1!=null){
				newHead.next = new ListNode(head1.val);
				head1 = head1.next;
				newHead = newHead.next;
			}
			while(head2!=null){
				newHead.next = new ListNode(head2.val);
				head2 = head2.next;
				newHead = newHead.next;
			}
		}
		return returnHead.next;
	}
	
	public static void print(ListNode l)
	{
		while(l!=null){
			System.out.println(l.val);
			l = l.next;
		}
	}
}
