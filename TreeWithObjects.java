public class TreeWithObjects {


    public TreeWithObjects() {

    }

    public void preorder(TreeNode t) {
        if (t != null)
        {
            System.out.print(t.data + " ");
            preorder(t.left);
            preorder(t.right);
        }
    }

    public void inorder(TreeNode t) {
        if (t != null) {
            inorder(t.left);
            System.out.print(t.data + " ");
            inorder(t.right);
        }
    }

    public void postorder(TreeNode t) {
        if (t != null) {
            postorder(t.left);
            postorder(t.right);
            System.out.print(t.data + " ");
        }
    }    
}
