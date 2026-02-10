public class TreeExample {
    public static void main(String[] args) {
        
        // rakennetaan puu käsin
        TreeNode a = new TreeNode('A');
        TreeNode b = new TreeNode('B');
        TreeNode k = new TreeNode('K');
        TreeNode x = new TreeNode('X');
        TreeNode c = new TreeNode('C');
        TreeNode h = new TreeNode('H');
        TreeNode u = new TreeNode('U');

        TreeNode root = a;
        a.left = b;
        a.right = c;
        b.left = k;
        b.right = x;
        c.left = h;
        c.right = u;

        //TreeWithObjects tree = new TreeWithObjects();
        //tree.preorder(root);

        // tulostetaan esijärjestys
        System.out.println("esijärjestys");
        Tree.preorder(root);

        System.out.println();
        System.out.println("esijärjestys pinon avulla");
        Tree.preorderStack(root);        

        System.out.println();
        System.out.println("sisäjärjestys");
        Tree.inorder(root);

        System.out.println();
        System.out.println("jälkijärjestys");
        Tree.postorder(root);
    }
}
