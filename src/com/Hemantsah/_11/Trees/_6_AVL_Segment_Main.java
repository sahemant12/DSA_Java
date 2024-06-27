package com.Hemantsah._11.Trees;

public class _6_AVL_Segment_Main {
    public static void main(String[] args) {
        _5_AVLTree_Implementation avl = new _5_AVLTree_Implementation();

        for (int i = 0; i < 1000; i++) {
            avl.insertionBST(i);
        }
//        avl.inOrder();
//        avl.levelOrder();
        System.out.println(avl.getHeight());
    }
}
