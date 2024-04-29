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
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        System.out.println(removeElements(head,6));
    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode node = null;
        ListNode curr = head;


        while (curr != null) {

            if (curr.val == val) {

                if (node == null) {
                    head = head.next;
                } else {
                    node.next = curr.next;
                }
            } else {
                node = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}