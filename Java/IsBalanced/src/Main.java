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
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        int x = ee(root.left);
        int y = ee(root.right);

        if (Math.abs(x - y) > 1)
            return false;
        else {
            return true;
        }


    }

    int ee(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int x = ee(node.left);
        int y = ee(node.right);

        return Math.max(x, y) + 1;
    }
}