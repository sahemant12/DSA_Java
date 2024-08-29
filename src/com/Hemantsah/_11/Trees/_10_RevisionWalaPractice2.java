package com.Hemantsah._11.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _10_RevisionWalaPractice2 {
}
class PracticeBinaryTree{
    class Node{
        int val;
        Node left;
        Node right;
        int ht;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, int ht){
            this.val = val;
            this.ht = ht;
        }
    }
    private Node root;

    public int getValue(Node node){
        return node.val;
    }

    public int getHeight(Node node){
        if(node==null){
            return -1;
        }
        return node.ht;
    }

    public boolean isEmpty(){
        return root==null;
    }

    //insertion
    public void insertion(int value){
        root = insertion(root,value);
    }
    public Node insertion(Node node, int value){
        if(node==null){
            node = new Node(value);
            return node;
        }
        if(node.val>value){
            node.left = insertion(node.left,value);
        }
        if(node.val<value){
            node.right = insertion(node.right,value);
        }
        node.ht = Math.max(getHeight(node.left),getHeight(node.right))+1;
        return node;
    }

    //balanced
    public boolean balanced(){
        return isBalanced(root);
    }
    public boolean isBalanced(Node node){
        return isBalanced(node.left) && isBalanced(node.right) && Math.abs(getHeight(node.left)-getHeight(node.right))<=1;
    }

    //populate
    public void populate(int[] arr){
        for(int i=0; i<arr.length; i++){
            root = insertion(root, arr[i]);
        }
    }

    //display
    public void display(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.val);
        display(node.left);
        display(node.right);
    }
    //Traversals
    //inorder
    public void inorder(Node node){
        if(node==null){
            return;
        }
        display(node.left);
        System.out.println(node.val);
        display(node.right);
    }
    //level-order traversal
    public void levelOrder(Node node){
        if(node==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        q.offer(null);
        while(!q.isEmpty()){
            Node peek = q.poll();
            if(peek!=null){
                System.out.print(peek.val+" ");
                if(peek.left!=null){
                    q.offer(peek.left);
                }
                if(peek.right!=null){
                    q.offer(peek.right);
                }
            }else{
                q.poll();
                if(q.isEmpty()){
                    break;
                }
                System.out.println();
                q.add(null);
            }
        }
    }
    //Search
    public boolean searchBST(int val){
        return searchBST(root, val);
    }
    public boolean searchBST(Node node, int val){
        if(node==null){
            return false;
        }
        if(node.val==val){
            return true;
        }else if(node.val>val){
            return searchBST(root.left, val);
        }else{
            return searchBST(root.right, val);
        }
    }
    //Deletion
    public void deletion(int val){
        root = deletion(root, val);
    }
    public Node deletion(Node node, int val){
        if(node==null){
            return null;
        }
        if(node.val==val){

            //delete node having zero children
            if(node.left==null && node.right==null){
                return null;
            }

            //delete node having zero children
            if(node.left==null){
                return node.right;
            }
            if(node.right==null){
                return node.left;
            }

            Node inOrderSuccessor = inOrderSuccessor(node.right);
            node.right = deletion(node.right, inOrderSuccessor.val);
            node.val = inOrderSuccessor.val;
        }else if(node.val>val){
            node.left = deletion(node.left, val);
        }else{
            node.right = deletion(node.right, val);
        }

        return node;
    }
    private Node inOrderSuccessor(Node node) {
        if(node.left==null){
            return node;
        }
        return inOrderSuccessor(node.left);
    }
    //Diameter
    public int diameter(Node node){
        if(node==null){
            return 0;
        }
        int d1 = diameter(node.left);
        int d2 = diameter(node.right);
        int d3 = findHeight(node.left) + findHeight(node.right) + 1;
        return Math.max(Math.max(d1,d2),d3);
    }
    public class TreeInfo{
        int dia;
        int ht;
        public TreeInfo(int dia, int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }
    public TreeInfo optiDiameter(Node node){
        if(node==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = optiDiameter(node.left);
        TreeInfo right = optiDiameter(node.right);

        int d1 = left.dia;
        int d2 = right.dia;
        int d3 = left.ht + right.ht + 1;
        int height = Math.max(left.ht, right.ht)+1;
        int diameter = Math.max(d3, Math.max(d1,d2));
        return new TreeInfo(diameter, height);
    }

    private int findHeight(Node node) {
        if(node==null){
            return 0;
        }
        int h1 = findHeight(node.left);
        int h2 = findHeight(node.right);
        return Math.max(h1,h2)+1;
    }
    //print in Range
    public void printInRange(Node root, int x, int y){

        if(y<root.val){
            printInRange(root.left,x,y);
        }else if(x>root.val){
            printInRange(root.right,x,y);
        }else if(x<root.val && y>root.val){
            System.out.println(x);

        }
    }
    //Root to Leaf Path
    public void RootToLeaf(Node root, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        if(root.left==null && root.right==null){
            System.out.println(list);
            return;
        }
        RootToLeaf(root.left, list);
        RootToLeaf(root.right, list);
        list.remove(list.size()-1);
    }
    //KK: level order traversal
    public void levelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int level = q.size();
            for(int i=0; i<level; i++){
                Node currNode = q.poll();
                System.out.print(currNode+" ");

                if(currNode.left!=null){
                    q.offer(currNode.left);
                }
                if(currNode.right!=null){
                    q.offer(currNode.right);
                }
            }
        }
    }
    //countNodes
    public int countNode(Node root){
        if(root==null){
            return 0;
        }
        return countNode(root.left)+countNode(root.right)+1;
    }
    //sumOfNodes
    public int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        return root.val+sumOfNodes(root.left)+sumOfNodes(root.right);
    }
    //sumOfNodesKthLevel
    public int sumOfNodesKthLevel(Node root, int k){
        if(root==null){
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int count=0;
        int sum=0;
        while(!q.isEmpty()){
            sum=0;
            int level = q.size();
            count++;
            for(int i=0; i<level; i++){
                Node currNode = q.poll();
                sum+=currNode.val;
                System.out.print(currNode+" ");
                if(currNode.left!=null){
                    q.offer(currNode.left);
                }
                if(currNode.right!=null){
                    q.offer(currNode.right);
                }
            }
            if(count==k){
                break;
            }
        }
        return sum;
    }
    //isPathExist: Easy
//    public boolean isPathExist(Node node, int[] arr){
//        if(node==null){
//            return arr.length==0;
//        }
//        return isPathExist(node, arr, 0);
//    }
//    public boolean isPathExist(Node node, int[] arr, int i){
//        if()
//        if(node.val==arr[i]){
//            return isPathExist(node.left, arr, i+1) || isPathExist(node.right, arr, i+1);
//        }
//        return isPathExist(node.left, arr, i) || isPathExist(node.right, arr, i);
//    }
    public int levelOrderSuccessor(Node root, int target){
        if(root==null){
            return -1;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int level = q.size();
            for(int i=0; i<level; i++){
                Node currNode = q.poll();
                System.out.print(currNode+" ");
                if(currNode.left!=null){
                    q.offer(currNode.left);
                }
                if(currNode.right!=null){
                    q.offer(currNode.right);
                }
                if(currNode.val==target && q.peek()!=null){
                    return q.peek().val;
                }
            }
        }
        return -1;
    }
}
