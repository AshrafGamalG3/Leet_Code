// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        ListNode node=new ListNode(1);
         node.next=new ListNode(2);
//         node.next.next=new ListNode(3);
//         node.next.next.next=new ListNode(4);
//         node.next.next.next.next=new ListNode(5);

        System.out.println(removeNthFromEnd(node,1));
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {




        ListNode count = head;

        int i = 1;
        while (count != null) {
            i++;
            count = count.next;
        }
        i=i-1;
        if (i==1){
            return null;
        }
        if (i==0){
            return head.next;
        }
        int y = i - n;
        System.out.println(i);
        System.out.println(n);
        System.out.println(y);

        ListNode curr =head.next;
        ListNode node=head;
         i=1;
        while (curr!=null){
            if (i==y){
                node.next=curr.next;
                curr=curr.next;
            }else {
                curr=curr.next;
                node=node.next;
            }
            i++;
        }

        return head;
    }
}