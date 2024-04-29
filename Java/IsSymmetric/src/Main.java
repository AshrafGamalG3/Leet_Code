// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {    public class TreeNode {
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
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        return rr(root.left, root.right);
    }

    public boolean rr(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;

        if (left == null || right == null)
            return false;

        return (left.val == right.val) && rr(left.left, right.right) && rr(left.right, right.left);
    }
}