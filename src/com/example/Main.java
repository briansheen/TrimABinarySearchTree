package com.example;

public class Main {

    public static void main(String[] args) {
        TreeNode Tree1 = new TreeNode(3);
        TreeNode a = new TreeNode(0);
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(2);
        TreeNode h = new TreeNode(1);
        Tree1.left = a;
        Tree1.right = b;
        a.right = c;
        c.left = h;
        System.out.println(Tree1);
        System.out.println(trimBST(Tree1, 1, 3));
    }

    public static TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        if (root.val < L) {
            return trimBST(root.right, L, R);
        }
        if (root.val > R) {
            return trimBST(root.left, L, R);
        }
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}
