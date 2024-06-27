package com.Hemantsah._11.Trees;

import java.util.*;

public class _5_AVLTree_Implementation {
    public _5_AVLTree_Implementation() {

    }

    private static class Node {
        private int value;
        private Node left;
        private Node right;
        public int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    //get height
    public int getHeight(){
        return getHeight(root);
    }
    public int getHeight(Node node) {

        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }


    public void insertionBST(int value) {
        root = insertionBST(value, root);
    }

    private Node insertionBST(int value, Node node) {

        if (node == null) {
            node = new Node(value); //at the end create node and return node.
            return node;
        }

        if (value < node.value) {
            node.left = insertionBST(value, node.left);
        }
        if (value > node.value) {
            node.right = insertionBST(value, node.right);
        }

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;

        return rotate(node); //This node is child node (parent, child, grandchild)
    }
    private Node rotate(Node node){  //Node is parent node

        if(getHeight(node.left)-getHeight(node.right)>1){ //left heavy
            if(getHeight(node.left.left)-getHeight(node.left.right)>0){ //L-L Case
                return rightRotate(node);
            }
            if(getHeight(node.left.left)-getHeight(node.left.right)<0){ //L-R Case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(getHeight(node.left)-getHeight(node.right)<-1){ //right heavy
            if(getHeight(node.right.right)-getHeight(node.right.left)>0){ //R-R Case
                return leftRotate(node);
            }
            if(getHeight(node.right.right)-getHeight(node.right.left)<0){ //R-L Case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }
    private Node rightRotate(Node parent){
        //1. parent.left = child.right;
        //2. child.right = parent
        Node child = parent.left; //store child node
        parent.left = child.right;
        child.right = parent;

        //update the height
        parent.height = Math.max(getHeight(parent.left),getHeight(parent.right))+1;
        child.height = Math.max(getHeight(child.left),getHeight(child.right))+1;
        return child;
    }
    private Node leftRotate(Node parent){

        Node child = parent.right; //store child node
        parent.right = child.left;
        child.left = parent;

        //update the height
        parent.height = Math.max(getHeight(parent.left),getHeight(parent.right))+1;
        child.height = Math.max(getHeight(child.left),getHeight(child.right))+1;
        return child;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void populate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            insertionBST(arr[i]);
        }
    }

    public void populateSorted(int[] arr, int s, int e) {
        if (s > e) {
            return;
        }
        int mid = s + (e - s) / 2;
        insertionBST(arr[mid]);
        populateSorted(arr, s, mid - 1);
        populateSorted(arr, mid + 1, e);
    }

    public void display() {
        display(root, "Root node is: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left value of node: " + node.value + "\t");
        display(node.right, "Right value of node: " + node.value + "\t");
    }

    //Pre-Order Traversals
    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //Post-Order Traversals
    public void postOrder() {
        postOrder(root);
        System.out.println();

    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    //In-Order Traversals
    public void inOrder() {
        inOrder(root);
        System.out.println();

    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    //Level-Order Traversals
    public void levelOrder(){
        levelOrder(root);
    }
    private void levelOrder(Node node){
        if(node==null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);
        while(!queue.isEmpty()){
            Node currNode = queue.remove();
            if(currNode==null){
                if(queue.isEmpty()){
                    break;
                }else{
                    System.out.println();
                    queue.add(null);
                }
            }else{
                System.out.print(currNode.value+" ");

                if(currNode.left!=null){
                    queue.add(currNode.left);
                }
                if(currNode.right!=null){
                    queue.add(currNode.right);
                }

            }
        }
    }
}
