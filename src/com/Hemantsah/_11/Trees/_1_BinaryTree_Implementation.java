package com.Hemantsah._11.Trees;
import java.util.Scanner;
public class _1_BinaryTree_Implementation { //BT has

    //constructor
    public _1_BinaryTree_Implementation(){
    }

    //Node
    private static class Node{

        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    //Root element
    private Node root;

    //insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root value: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node){

        //insert left
        System.out.println("Do you want to insert left of "+ node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value left of "+node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        //insert right
        System.out.println("Do you want to insert right of "+ node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value right of "+node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }
    public void display(){
        display(root,"");
    }
    private void display(Node node, String indent){
        if(node==null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }


//    public void displayPrettier(){
//        displayPrettier(root,0);
//    }
//    private void displayPrettier(Node node, int level){ //Do it later
//        if(node==null){
//            return;
//        }
//    }
    public void buildBT(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            root = buildBT(root, arr[i]);
        }
    }
    private Node buildBT(Node node, int value){
        if(node==null){
            return new Node(value);
        }
        //left Insertion
        if(node.left==null){
            node.left = buildBT(node.left, value);
        }
        //right Insertion
        if(node.right==null){
            node.right = buildBT(node.right, value);
        }
        return root;
    }
}
