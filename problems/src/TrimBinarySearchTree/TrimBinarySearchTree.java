package TrimBinarySearchTree;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2018/2/27
 */
public class TrimBinarySearchTree {

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        if (root.val >= L && root.val <= R) {
            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
            return root;
        }
        if (root.val > R) {
            return trimBST(root.left, L, R);
        }
        return trimBST(root.right, L, R);
    }

}
