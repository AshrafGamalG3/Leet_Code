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
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findBig(root);
        return max;
    }

    int findBig(TreeNode root) {
        if (root == null)
            return 0;
        int rightSum = Math.max(findBig(root.right), 0);
        int leftSum = Math.max(findBig(root.left), 0);
        max = Math.max(max, root.val + leftSum + rightSum);
        return root.val + Math.max(leftSum, rightSum);
    }
}