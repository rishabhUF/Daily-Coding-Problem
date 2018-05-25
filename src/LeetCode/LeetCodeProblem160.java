package LeetCode;

//Intersection of Two Linked Lists
public class LeetCodeProblem160 {

	public static void main(String[] args)
	{
		ListNode head1 = new ListNode(1);
		ListNode a = head1;
		head1.next = new ListNode(3);
		ListNode head2 = new ListNode(2);
		ListNode b = head2;
		head2.next = new ListNode(3);
		ListNode r = getIntersectionNode(a,b);
	}
	
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
         ListNode a = headA;
         ListNode b = headB;
         while(a!=b){
        	 a = a == null ? headB : a.next;
        	 b = b == null ? headA : b.next;
         }
         return a;
	}
}
