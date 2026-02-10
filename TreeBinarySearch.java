public class TreeBinarySearch {
    public static void main(String[] args) {
        String merkit = "TIETORAKENTEETJAALGORITMITJAVAKIELELLÄ";
        // rakennetaan puu
        // tehdään juuri ja laitetaan siihen ensimmäinen merkki
        TreeNode root = new TreeNode(merkit.charAt(0));

        // jatketaan toisesta merkistä eteenpäin
        for (int i = 1; i < merkit.length(); i++) {
            char c = merkit.charAt(i);
            TreeNode node = new TreeNode(c);
            Tree.insert(root, node);
        }

        // tulostetaan sisäjärjestys
        Tree.inorder(root);

        System.out.println();
        // kokeillaan hakua
        TreeNode f = Tree.find(root, 'R');
        if (f == null)
            System.out.println("ei löydy");
        else
            System.out.println("löytyi " + f.data);
    }
}
