public class BSTMain {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        TreeNode root = null;
        int[] treeData = {15, 20, 18, 12, 25, 10, 14};
        for (int data : treeData) {
            root = treeNode.insert(root, data);
        }
        System.out.print(root.getLeft().getRight().getData());

        System.out.println();
        System.out.print("Pre Order : ");
        treeNode.preOrder(root);

        System.out.println();
        System.out.print("In Order : ");
        treeNode.inOrder(root);

        System.out.println();
        System.out.print("Post Order : ");
        treeNode.postOrder(root);

        System.out.println();
        int dataSearch = 20;
        TreeNode searchNode = treeNode.search(root, dataSearch);
        System.out.println("Get node the right side of the node " + dataSearch + " :" + searchNode.getRight().getData());

    }
}
