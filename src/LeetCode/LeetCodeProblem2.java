package LeetCode;

public class LeetCodeProblem2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode(0);
        ListNode result = res;
        while(l1!=null || l2!=null){
            if(l1!=null){
                carry += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                carry += l2.val;
                l2 = l2.next;
            }
            res.next = new ListNode(carry%10);
            res = res.next;
            carry/=10;
       }
       if(carry != 0){
           res.next = new ListNode(carry%10);
       }
        return result.next;
    }
}
