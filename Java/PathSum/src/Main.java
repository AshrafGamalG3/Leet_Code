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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        if (root.left == null && root.right == null && root.val == targetSum) {
            List<Integer> path = new ArrayList<>();
            path.add(root.val);
            lists.add(path);
            return lists;
        }
        List<List<Integer>> listRight = pathSum(root.right, targetSum - root.val);
        List<List<Integer>> listLeft = pathSum(root.left, targetSum - root.val);
        for (List<Integer> path : listRight) {
            List<Integer> updatedPath = new ArrayList<>();
            updatedPath.add(root.val);
            updatedPath.addAll(path);
            lists.add(updatedPath);
        }
        for (List<Integer> path : listLeft) {
            List<Integer> updatedPath = new ArrayList<>();
            updatedPath.add(root.val);
            updatedPath.addAll(path);
            lists.add(updatedPath);
        }
        return lists;
    }
}