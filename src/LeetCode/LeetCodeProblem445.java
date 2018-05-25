package LeetCode;

import java.util.Stack;

// Add Two Numbers II

public class LeetCodeProblem445 {

	public static void main(String[] args){
		ListNode head1 = new ListNode(1);
		ListNode a = head1;
		head1.next = new ListNode(3);
		ListNode head2 = new ListNode(2);
		ListNode b = head2;
		head2.next = new ListNode(4);
		ListNode r = addTwoNumbers(a,b);
	}
	
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        Stack<Integer> s1 = new Stack<>();
	        Stack<Integer> s2 = new Stack<>();
	        while(l1 != null || l2 != null)
	        {
	            if(l1!=null){
	                s1.push(l1.val);
	                l1 = l1.next;
	            }
	                
	            if(l2!=null){
	                s2.push(l2.val);
	                l2 = l2.next;
	            }
	                
	        }
	        ListNode current =null;
	        int carry = 0;
	        while(!s1.isEmpty() || !s2.isEmpty())
	        {
	            int a = s1.isEmpty() ? 0 : s1.pop();
	            int b = s2.isEmpty() ? 0 : s2.pop();
	            ListNode node = new ListNode((a+b+carry)%10);
	            carry = (a+b+carry)/10;
	            node.next = current;
	            current = node;
	        }
	        if(carry > 0)
	        {
	            ListNode node = new ListNode(carry);
	            node.next = current;
	            current = node;
	        }
	        return current;
	    }
}
