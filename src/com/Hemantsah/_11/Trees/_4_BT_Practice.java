//package com.Hemantsah._11.Trees;
//
//import java.util.Scanner;
//
//public class _4_BT_Practice {
//
//    public _4_BT_Practice(){
//
//    }
//    public class Node{
//        private int value;
//        private Node left;
//        private Node right;
//
//        public Node(int value){
//            this.value=value;
//        }
//        public int getvalue(){
//            return this.value;
//        }
//    }
//    private Node root;
//
//    //insertion
//    public void populate(Scanner scanner){
//        int value = scanner.nextInt();
//        root = new Node(value); //Creating new Node
//        populate(root, scanner);
//    }
//    private void populate(Node node, Scanner scanner){
//
//        System.out.println("Do you want to add left of node: "+node.getvalue());
//        boolean left = scanner.nextBoolean();
//        if(left){
//            System.out.println("Enter the left value of node: "+node.getvalue());
//            int value = scanner.nextInt();
//            node.left = new Node(value);
//            populate(node.left, scanner);
//        }
//
//        System.out.println("Do you want to add right of node: "+node.getvalue());
//        boolean right = scanner.nextBoolean();
//        if(right){
//            System.out.println("Enter the right value of node: "+node.getvalue());
//            int value = scanner.nextInt();
//            node.right = new Node(value);
//            populate(node.right, scanner);
//        }
//    }
//
//    public void display(){
//        display(root);
//    }
//    private void display(Node node){
//        if(node==null){
//            return;
//        }
//        System.out.println(node.getvalue());
//        display(node.left);
//        display(node.right);
//    }
//
//
//    public static void main(String[] args) {
//        _4_BT_Practice btp = new _4_BT_Practice();
//        btp.populate(new Scanner(System.in));
//        btp.display();
//    }
//}




package com.Hemantsah._11.Trees;

import java.util.Scanner;

//BST
public class _4_BT_Practice {

    public _4_BT_Practice(){

    }
    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value=value;
        }
        public int getvalue(){
            return this.value;
        }
    }
    private Node root;
    public int getHeight(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    //insertion
    public void populate(int value){
        root = populate(value,root);
    }
    private Node populate(int value, Node node){
        if(node==null){
            //create new node
            node = new Node(value);
            return node;
        }
        if(value<node.value){
            node.left = populate(value,node.left);
        }
        if(value>node.value){
            node.right = populate(value,node.right);
        }
        node.height = Math.max(getHeight(node.left), getHeight(node.right))+1;
        return node;
    }

    public void display(){
        display(root);
    }
    private void display(Node node){
        if(node==null){
            return;
        }
        display(node.left);
        System.out.print(node.getvalue()+" ");
        display(node.right);
    }
    public boolean isBalanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <=1 && isBalanced(node.left)  && isBalanced(node.right);
    }
    public class infoTree{
        int ht;
        int diam;
        public infoTree(int ht, int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
public infoTree optimizedDia(Node node){
        if(node==null){
            new infoTree(0,0);
        }
    infoTree left = optimizedDia(node.left);
    infoTree right = optimizedDia(node.right);

    int myHeight = Math.max(left.ht, right.ht) + 1;
    int d1 = left.diam;
    int d2 = right.diam;
    int d3 = left.ht + right.ht + 1;
    int mydiam = Math.max(Math.max(d1,d2),d3);
    return new infoTree(myHeight, mydiam);

}
    public static void main(String[] args) {
        _4_BT_Practice btp = new _4_BT_Practice();
        btp.populate(5);
        btp.populate(2);
        btp.populate(3);
        btp.populate(6);
        btp.populate(8);
        btp.populate(7);
        btp.populate(10);
        btp.populate(1);
        btp.display();
    }
}
