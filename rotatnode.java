public class rotatnode {

    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val)
        {
            this.val=val;
            this.next=null;
        }
        public static  rotatnode.ListNode insert(ListNode head,int val)
        {
            ListNode newNode=new ListNode(val);
            if(head==null)
            {
                return newNode;
            }
            ListNode current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newNode;
            return head;
        }
        
        public static ListNode  rotate(ListNode head)
        {
            ListNode prev=null,tail=head;
            while(tail.next!=null)
            {
                prev=tail;
                tail=tail.next;
            }
            prev.next=null;
            tail.next=head;
        
            return tail;
             
        }
        public static void printList(ListNode head)
        {
            ListNode current=head;
            while (current!=null)
            {
                System.out.print(current.val+"->");
                current=current.next;
            }
            System.out.println("null");
        } 
    }
    public static void main(String[] args) {
        ListNode head=null;
        int k=100;
        head=ListNode.insert(head,10);
        head=ListNode.insert(head,2);
        head=ListNode.insert(head,7);
        head=ListNode.insert(head,1);
        head=ListNode.insert(head,94);
        head=ListNode.insert(head,76);
        head=ListNode.insert(head,6);
        ListNode.printList(head);
        for(int x=1;x<=k;x++)
        {
            head=ListNode.rotate(head);
        }
        ListNode.printList(head);
        }
            
}
