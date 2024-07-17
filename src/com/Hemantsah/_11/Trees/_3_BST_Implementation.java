package com.Hemantsah._11.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class _3_BST_Implementation {
    public _3_BST_Implementation(){

    }
    private static class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }
    private Node root;

    //get height
    public int getHeight(Node node){

        if(node==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }


    public void insertionBST(int value){
        root = insertionBST(value,root);
    }
    private Node insertionBST(int value, Node node){ //Debug yourself in copy using E.g: {15, 10, 20, 5, 12} insert:8
        //at the end node==null
        if(node==null){
            node = new Node(value); //at the end create node and return node.
            return node;
        }

        if(value<node.value){
            node.left = insertionBST(value, node.left);
        }
        if(value>node.value){
            node.right = insertionBST(value, node.right);
        }

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) +1 ;
        return node;
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(getHeight(node.left)-getHeight(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    public void populate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            insertionBST(arr[i]);
        }
    }
    public void populateSorted(int[] arr,int s, int e){
        if(s>e){
            return;
        }
            int mid = s+(e-s)/2;
            insertionBST(arr[mid]);
        populateSorted(arr,s,mid-1);
        populateSorted(arr,mid+1,e);

    }
    public void display(){
        display(root,"Root node is: ");
    }
    private void display(Node node, String details){
        if(node==null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left,"Left value of node: "+ node.value+ "\t");
        display(node.right,"Right value of node: "+ node.value+ "\t");
    }

    //Pre-Order Traversals
    public void preOrder(){
        preOrder(root);
        System.out.println();
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //Post-Order Traversals
    public void postOrder(){
        postOrder(root);
        System.out.println();

    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }

    //Pre-Order Traversals
    public void inOrder(){
        inOrder(root);
        System.out.println();

    }
    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+" ");
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
//Search in BST:
    public boolean searchBST(int target){
        return searchBST(root, target);
    }
    private boolean searchBST(Node node, int target){ //TC: 0(H)
        if(node==null){
            return false;
        }
        if(node.value==target){
            return true;
        }else if(node.value>target){
             return searchBST(node.left, target);
        }else{
             return searchBST(node.right, target);
        }
    }

//Deletion in BST:
    public Node deleteNode(int target){
        root = deleteNode(root, target);
        return root;
    }
    private Node deleteNode(Node node, int target){
        if(node==null){
            return node;
        }
        if(node.value==target){

            //No child
             if(node.left==null && node.right==null){
                 return null;
             }
             //One child
            if(node.left==null){
                return node.right;
            }
            if(node.right==null){
                return node.left;
            }

            //two child
            Node inorderSuccessor = inorderSuccessor(node.right);
            node.value = inorderSuccessor.value;
            //delete inorder successor
            node.right = deleteNode(node.right, inorderSuccessor.value);

        }else if(node.value>target){
             node.left = deleteNode(node.left, target);
        }else{
            node.right = deleteNode(node.right, target);
        }
        return node;
    }

    public Node inorderSuccessor(Node node){
        if(node.left==null){
            return node;
        }
        return inorderSuccessor(node.left);
    }

//print in Range
    public void printInRange(int x, int y){
         printInRange(root, x,y);
    }
    private void printInRange(Node node,int x, int y){ //TC: 0(H)
        if(node==null){
             return;
        }
        if(x<=node.value && y>=node.value){
            printInRange(node.left,x,y);
            printInRange(node.right,x,y);
            System.out.println(node.value);

        }else if(x>node.value){
             printInRange(node.right, x,y);
        }else if(y<node.value){
             printInRange(node.left, x,y);
        }
    }

//Root to Leaf Path
    public void RootToLeafPath(){
        ArrayList<Integer>list = new ArrayList<>();
         RootToLeafPath(root,list);
    }
    private void RootToLeafPath(Node node, ArrayList<Integer>list) {
        if(node==null){
            return;
        }

        list.add(node.value);
        if(node.left==null && node.right==null){
            System.out.println(list);
        }else{
            RootToLeafPath(node.left,list);
            RootToLeafPath(node.right,list);
        }
        list.remove(list.size()-1);
    }

    //KK BT/BST Ques:
    public int levelOrder(Node root, int key) {
        Queue<Node> q = new LinkedList<>();
        if(root==null){
            return -1;
        }
        q.add(root);
        while(!q.isEmpty()){
                Node currNode = q.poll();
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
                if(currNode.value==key){
                    return q.poll().value;
                }
        }
    return -1;
    }








    //All these are BT Questions
    public int countNodes(){
        return countNodes(root);
    }
    private int countNodes(Node node){
        if(node==null){
            return 0;
        }
        int NoLeftNode = countNodes(node.left);
        int NoRightNode = countNodes(node.right);
        return NoLeftNode + NoRightNode + 1;
    }

    public int sumOfNodes(){
        return sumOfNodes(root);
    }
    private int sumOfNodes(Node node){
        if(node==null){
            return 0;
        }
        int LeftSum = sumOfNodes(node.left);
        int RightSum = sumOfNodes(node.right);
        return LeftSum + RightSum + node.value;
    }

    public int sumOfNodesKthLevel(int k){
        return sumOfNodesKthLevel(root,k);
    }
    private int sumOfNodesKthLevel(Node node, int k){
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);
        int i=1; int sum=0;

        while(!q.isEmpty()){

            if(i==k){
                while(q.peek()!=null){
                    sum+=q.remove().value;
                }
                break;
            }
            Node currNode = q.remove();
            if(currNode==null){
                if(q.isEmpty()){
                    break;
                }
//                System.out.println();
                q.add(null);
                i++;
            }else{
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
            return sum;
    }


public int height(Node node){
        if(node==null){
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int myHeight = Math.max(leftHeight, rightHeight) +1;
        return myHeight;
}

    public int diameterOfNodes(){
        return diameterOfNodes(root);
    }
    private int diameterOfNodes(Node node){ //0(n2): going to every node * calculating ht of every node
        if(node==null){
            return 0;
        }
        int leftSideDiameter = diameterOfNodes(node.left);
        int rightSideDiameter = diameterOfNodes(node.right);
        int diameterincludingRoot = height(node.left) + height(node.right) + 1;
        int diameter = Math.max(diameterincludingRoot, Math.max(leftSideDiameter, rightSideDiameter));
        System.out.println(leftSideDiameter+" "+rightSideDiameter+" "+diameterincludingRoot+" "+diameter);
        return diameter;
    }

    //0(n): calculate both ht. and diameter together
    public class TreeInfo{ //Node returning ht. and diameter together i.e why create Node class
        int ht;
        int diam;
        public TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public TreeInfo optimizeDiameterOfNodes(){
        return optimizeDiameterOfNodes(root);
    }
    private TreeInfo optimizeDiameterOfNodes(Node node){
        if(node==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = optimizeDiameterOfNodes(node.left);
        TreeInfo right = optimizeDiameterOfNodes(node.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int d1 = left.diam;
        int d2 = right.diam;
        int d3 = left.ht + right.ht + 1;
        int myDiameter = Math.max(Math.max(d1,d2),d3);

        TreeInfo myInfo = new TreeInfo(myHeight, myDiameter);
        return myInfo;
    }
    public boolean isPathExist(Node node, int[] arr){
        if(node==null){
            return arr.length==0;
        }
        return isPathExist(node, arr, 0);
    }
    private boolean isPathExist(Node node, int[] arr, int i){
        if(node==null){
            return false;
        }
        if(node.value!=arr[i] || i>=arr.length){
            return false;
        }
        if(node.left==null && node.right==null && i==arr.length-1){
            return true;
        }
        return isPathExist(node.left, arr, i++) || isPathExist(node.right, arr, i++);
    }
}
