package LeetCode;
// delete a element in the linked list
public class LeetCodeProblem237 {
	public static void main(String[] args)
	{
		ListNode head1 = new ListNode(1);
		ListNode a = head1;
		head1.next = new ListNode(3);
		deleteNode(a);
	}

public static void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
}
}