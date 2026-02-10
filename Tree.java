import java.util.Stack;

public class Tree {

    public static TreeNode find(TreeNode t, char c) {
        TreeNode found = null;

        while (t != null) {
            if (c < t.data)
                t = t.left;
            else if (c > t.data)
                t = t.right;
            else {
                // löityi
                found = t;
                break;
            }
        }
        return found;
    }

    public static void insert(TreeNode t, TreeNode c) {
        TreeNode daddy = null;
        while (t != null) {
            daddy = t;
            if (c.data <= t.data) 
                t = t.left;
            else
                t = t.right;
        }

        if (c.data <= daddy.data) 
            daddy.left = c;
        else 
            daddy.right = c;
    }

    public static void preorder(TreeNode t) {
        if (t != null)
        {
            System.out.print(t.data + " ");
            preorder(t.left);
            preorder(t.right);
        }
    }

    public static void inorder(TreeNode t) {
        if (t != null) {
            inorder(t.left);
            System.out.print(t.data + " ");
            inorder(t.right);
        }
    }

    public static void postorder(TreeNode t) {
        if (t != null) {
            postorder(t.left);
            postorder(t.right);
            System.out.print(t.data + " ");
        }
    }

    public static void preorderStack(TreeNode t) {
        Stack<TreeNode> stack = new Stack<>();

        stack.push(t);
        do {
            t = stack.pop();
            if (t != null) {
                System.out.print(t.data + " ");
                stack.push(t.right);
                stack.push(t.left);
            }
        } while (stack.size() > 0);
    }
}
