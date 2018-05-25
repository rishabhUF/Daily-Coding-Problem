package LeetCode;

public class LeetCodeProblem83 {

	public static void main(String[] args)
	{
		ListNode head1 = new ListNode(1);
		ListNode a = head1;
		head1.next = new ListNode(3);
		deleteDuplicates(a);
	}
	
	public static ListNode deleteDuplicates(ListNode head)
	{
		ListNode p = head;
        while(head!=null && head.next!= null)
        {
            if(head.val == head.next.val){
                head.next = head.next.next;
            }
            else{
                head = head.next;
            }
        }
        return p;
	}
}
