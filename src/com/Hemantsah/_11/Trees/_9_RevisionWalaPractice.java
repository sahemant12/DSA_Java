package com.Hemantsah._11.Trees;

import java.util.Scanner;

public class _9_RevisionWalaPractice {
}
class BinaryTree{
    class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }
    private Node root;
    private Node Populate(Scanner in){
        int value = in.nextInt();
        root = new Node(value);
        insertion(root, in);
        return root;
    }
    private void insertion(Node root, Scanner in){
        if(root==null){
            //create new node
            int value = in.nextInt();
            root = new Node(value);
            return;
        }
        System.out.println("Do you want to add at left");
        boolean yesLeft = in.nextBoolean();
        if(yesLeft){
            insertion(root.left, in);
        }

        System.out.println("Do you want to add at Right");
        boolean yesRight = in.nextBoolean();
        if(yesRight){
            insertion(root.right, in);
        }
    }
    public Node buildBT(int[] arr){
        for(int i=0; i<arr.length; i++){
            root = buildBT(root,arr[i]);
        }
        return root;
    }
    public Node buildBT(Node root, int value){
        if(root==null){
            root = new Node(value);
            return root;
        }
        if(root.value>value){
            root.left = buildBT(root.left,value);
        }
        if(root.value<value){
            root.right = buildBT(root.right,value);
        }
        return root;
    }

}
