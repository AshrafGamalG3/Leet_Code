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
    public int minDepth(TreeNode root) {
        int x, y;
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            y = minDepth(root.right);
            return y + 1;
        } else if (root.right == null) {
            x = minDepth(root.left);
            return x + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}