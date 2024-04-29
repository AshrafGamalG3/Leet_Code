import java.util.ArrayList;

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

        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(1);
            head.next.next.next = new ListNode(1);

            System.out.println(isPalindrome(head));

        }


        public static boolean isPalindrome(ListNode head) {
            ArrayList<Integer> list = new ArrayList<>();
            boolean flag=true;

            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
            ArrayList<Integer> reverse = new ArrayList<>(list.reversed());
            System.out.println(list);
            System.out.println(reverse);
            for (int i=0;i<list.size();i++){
                if (list.get(i).equals(reverse.get(i))){
                    flag=true;
                }else {
                    flag=false;
                    break;
                }
            }
            return flag;
        }
    }
}