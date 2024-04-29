// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

     public static class ListNode {
          int val;
          ListNode next;
     ListNode() {}
         ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static void main(String[] args) {
         ListNode node=new ListNode(1);
         node.next=new ListNode(2);
         node.next.next=new ListNode(3);
         node.next.next.next=new ListNode(4);

        System.out.println(swapPairs(node));
    }
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nextNode;

        while (curr != null) {
            nextNode=prev;
            prev=curr;
            curr=nextNode;
            curr=curr.next;

        }

        return head;
    }
}