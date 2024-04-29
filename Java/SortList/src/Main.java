import java.util.*;

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
        ListNode node=new ListNode(2);
        node.next=new ListNode(1);
        node.next.next=new ListNode(0);
         node.next.next.next=new ListNode(5);
        System.out.println(sortList(node));

    }
    public static ListNode sortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;


        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }


        Collections.sort(list);

        curr = head;
        int i = 0;


        while (curr != null) {
            curr.val = list.get(i);
            curr = curr.next;
            i++;
        }

        return head;

    }

}