class solution{
    public static void main(String[] args){
           addTwoNumbers(ListNode l1, ListNode l2);
    }
     public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int total=x+y+carry;
            carry= total/10;
            curr.next= new ListNode(total%10);
            curr=curr.next;
            if (l1!=null)
               l1=l1.next;
            if (l2!=null)
               l2=l2.next;
        }
        return dummy.next;

    }
}
