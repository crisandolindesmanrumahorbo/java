public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode();
            root.setData(data);
            return root;
        }
        if (data < root.getData()) {
            root.setLeft(insert(root.getLeft(), data));
        }
        if (data > root.getData()) {
            root.setRight(insert(root.getRight(), data));
        }
        return root;
    }

    public TreeNode search(TreeNode root, int data) {
        if (root == null || root.getData() == data) {
            return root;
        }
        if (data < root.getData()) {
            return root.search(root.getLeft(), data);
        }
        if (data > root.getData()) {
            return root.search(root.getRight(), data);
        }
        return null;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.getLeft());
        System.out.print(root.getData() + " ");
        inOrder(root.getRight());
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getData() + " ");
    }
}
