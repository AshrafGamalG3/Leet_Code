import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> integers = new ArrayList<>();
        postOrder(root, integers);
        return integers;
    }

    void postOrder(TreeNode node, List<Integer> result) {
        if (node == null)
            return;
        postOrder(node.left, result);
        postOrder(node.right, result);
        result.add(node.val);
    }
}