package com.Hemantsah._9.LinkedList;

public class _10_LinkedListPractice {
}
class SinglyLinkedList{
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next = next;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public void insertFirst(int value){
    Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int value){
        if(head==null){
            insertFirst(value);
            return;
        }
        //using tail
//        Node node = new Node(value);
//        node.next = null;
//        tail.next = node;
//        tail = node;
//        size+=1;

        //w/o tail
        Node node = new Node(value);
        node.next = null;
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = node;
        tail=node;
        size+=1;
    }

    public void insertBetween(int value, int position){
        if(position==1){
            insertFirst(value);
            return;
        }
        if(position==size){
            insertLast(value);
            return;
        }
        Node node = new Node(value);
        Node preNode = getPreNode(position);
        Node temp = preNode.next;
        preNode.next = node;
        node.next = temp;
        size+=1;
    }
    public Node getPreNode(int position){
        Node temp = head;
        while(position>1){
            temp=temp.next;
            position--;
        }
        return temp;
    }



    public void deleteFirst(int value){
        if(head==null){
            return;
        }
       Node temp = head;
       head = head.next;
       temp.next = null;
        size-=1;
    }
    public void deleteLast(int value){
        if(head==null){
            insertFirst(value);
            return;
        }
        //using tail
//        Node node = new Node(value);
//        node.next = null;
//        tail.next = node;
//        tail = node;
//        size+=1;

        //w/o tail
        Node node = new Node(value);
        node.next = null;
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = node;
        tail=node;
        size+=1;
    }

    public void deleteBetween(int value, int position){
        if(position==1){
            insertFirst(value);
            return;
        }
        if(position==size){
            insertLast(value);
            return;
        }
        Node node = new Node(value);
        Node preNode = getPreNode(position);
        Node temp = preNode.next;
        preNode.next = node;
        node.next = temp;
        size+=1;
    }
}
